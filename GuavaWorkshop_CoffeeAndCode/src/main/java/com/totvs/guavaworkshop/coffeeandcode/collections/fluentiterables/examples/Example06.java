package com.totvs.guavaworkshop.coffeeandcode.collections.fluentiterables.examples;

import java.util.List;
import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Multimaps;
import com.totvs.agridatagenerator.framework.readers.AgriDataReaderBO;
import com.totvs.agridatagenerator.vo.FazendaVO;
import com.totvs.agridatagenerator.vo.TalhaoVO;

public class Example06 {

	public static final Predicate<FazendaVO> FILTER_FAZENDAS_TALHAO_ALGODAO = new Predicate<FazendaVO>() {

		@Override
		public boolean apply(FazendaVO fazenda) {
			ImmutableListMultimap<String, TalhaoVO> talhoesCulturas = Multimaps.index(fazenda.getTalhoes(), new Function<TalhaoVO, String>() {

				@Override
				public String apply(TalhaoVO talhao) {
					return talhao.getCultura().getDescricao();
				}
			});

			return talhoesCulturas.containsKey("Algodão");
			// return talhoesCulturas.containsKey("Algodão") && talhoesCulturas.get("Algodão").size() >= 3;
		}
	};

	public static void main(String[] args) {

		List<FazendaVO> fazendas = AgriDataReaderBO.readFrom("C:\\Users\\guilherme.farto\\Desktop\\farm-dataset.json", Charsets.UTF_8);

		List<FazendaVO> fazendasFiltradas = FluentIterable.from(fazendas).filter(FILTER_FAZENDAS_TALHAO_ALGODAO).toList();

		System.out.println(fazendasFiltradas.size());
		System.out.println(fazendasFiltradas);

	}

}
