package com.totvs.guavaworkshop.coffeeandcode.collections.fluentiterables.examples;

import java.util.List;
import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Multimaps;
import com.totvs.agridatagenerator.framework.readers.AgriDataReaderBO;
import com.totvs.agridatagenerator.vo.FazendaVO;
import com.totvs.agridatagenerator.vo.TalhaoVO;

public class Example07 {

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
		}
	};

	public static void main(String[] args) {

		List<FazendaVO> fazendas = AgriDataReaderBO.readFrom("C:\\Users\\guilherme.farto\\Desktop\\farm-dataset.json", Charsets.UTF_8);

		List<FazendaVO> fazendasFiltradas = FluentIterable.from(fazendas).filter(FILTER_FAZENDAS_TALHAO_ALGODAO).transform(new Function<FazendaVO, FazendaVO>() {

			@Override
			public FazendaVO apply(FazendaVO fazenda) {
				ImmutableList<TalhaoVO> talhoesFiltrados = FluentIterable.from(fazenda.getTalhoes()).filter(new Predicate<TalhaoVO>() {

					@Override
					public boolean apply(TalhaoVO talhao) {
						return "Algodão".equals(talhao.getCultura().getDescricao());
					}
				}).toList();

				fazenda.clearTalhoes();
				fazenda.addTalhoes(talhoesFiltrados);

				return fazenda;
			}
		}).toList();

		System.out.println(fazendasFiltradas.size());
		System.out.println(fazendasFiltradas);

		for (FazendaVO fazenda : fazendasFiltradas) {
			System.out.println(fazenda.getCodigo());

			for (TalhaoVO talhao : fazenda.getTalhoes()) {
				System.out.println("  " + talhao.getCodigo() + " - " + talhao.getCultura() + " - " + talhao.getAreaProdutiva());
			}
		}

	}

}
