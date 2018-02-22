package com.totvs.guavaworkshop.coffeeandcode.collections.fluentiterables.examples;

import java.util.List;
import com.google.common.base.Charsets;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.totvs.agridatagenerator.framework.readers.AgriDataReaderBO;
import com.totvs.agridatagenerator.framework.utils.ListUtil;
import com.totvs.agridatagenerator.vo.FazendaVO;

public class Example03 {

	public static final Predicate<FazendaVO> FILTER_FAZENDAS_MAIOR_IGUAL_7_TALHOES = new Predicate<FazendaVO>() {

		@Override
		public boolean apply(FazendaVO fazenda) {
			return ListUtil.isNotNullOrEmpty(fazenda.getTalhoes()) && fazenda.getTalhoes().size() >= 7;
		}
	};

	public static final Predicate<FazendaVO> FILTER_FAZENDAS_MENOR_IGUAL_10_EQUIPAMENTOS = new Predicate<FazendaVO>() {

		@Override
		public boolean apply(FazendaVO fazenda) {
			return ListUtil.isNotNullOrEmpty(fazenda.getEquipamentos()) && fazenda.getEquipamentos().size() <= 10;
		}
	};

	public static void main(String[] args) {

		List<FazendaVO> fazendas = AgriDataReaderBO.readFrom("C:\\Users\\guilherme.farto\\Desktop\\farm-dataset.json", Charsets.UTF_8);

		List<FazendaVO> fazendasFiltradas = FluentIterable.from(fazendas).filter(FILTER_FAZENDAS_MAIOR_IGUAL_7_TALHOES).filter(FILTER_FAZENDAS_MENOR_IGUAL_10_EQUIPAMENTOS).toList();

		System.out.println(fazendasFiltradas.size());
		System.out.println(fazendasFiltradas);

	}

}
