package com.totvs.guavaworkshop.coffeeandcode.collections.ordering.examples;

import java.util.Comparator;
import java.util.List;
import com.google.common.base.Charsets;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.totvs.agridatagenerator.framework.readers.AgriDataReaderBO;
import com.totvs.agridatagenerator.vo.FazendaVO;

public class Example04 {

	public static void main(String[] args) {

		List<FazendaVO> fazendas = AgriDataReaderBO.readFrom("C:\\Users\\guilherme.farto\\Desktop\\farm-dataset.json", Charsets.UTF_8);

		Ordering<FazendaVO> ordering = Ordering.from(new Comparator<FazendaVO>() {

			@Override
			public int compare(FazendaVO f1, FazendaVO f2) {
				return Ints.compare(f1.getTalhoes().size(), f2.getTalhoes().size());
			}
		}).reverse();

		List<FazendaVO> fazendasOrdenadas = ordering.sortedCopy(fazendas);

		for (FazendaVO fazenda : fazendasOrdenadas) {
			System.out.println(fazenda.getCodigo() + " - " + fazenda.getDescricao() + " - " + fazenda.getTalhoes().size() + " talhões - " + fazenda.getEquipamentos().size() + " equipamentos");
		}

	}

}
