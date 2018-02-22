package com.totvs.guavaworkshop.coffeeandcode.collections.fluentiterables.examples;

import java.util.List;
import com.google.common.base.Charsets;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.totvs.agridatagenerator.framework.readers.AgriDataReaderBO;
import com.totvs.agridatagenerator.framework.utils.ListUtil;
import com.totvs.agridatagenerator.vo.FazendaVO;

public class Example02 {

	public static void main(String[] args) {

		List<FazendaVO> fazendas = AgriDataReaderBO.readFrom("C:\\Users\\guilherme.farto\\Desktop\\farm-dataset.json", Charsets.UTF_8);

		List<FazendaVO> fazendasFiltradas = filtrar(fazendas, 7);

		System.out.println(fazendasFiltradas.size());
		System.out.println(fazendasFiltradas);

	}

	public static List<FazendaVO> filtrar(List<FazendaVO> fazendas, final int quantidadeTalhoes) {
		return FluentIterable.from(fazendas).filter(new Predicate<FazendaVO>() {

			@Override
			public boolean apply(FazendaVO fazenda) {
				return ListUtil.isNotNullOrEmpty(fazenda.getTalhoes()) && fazenda.getTalhoes().size() >= quantidadeTalhoes;
			}
		}).toList();
	}

}
