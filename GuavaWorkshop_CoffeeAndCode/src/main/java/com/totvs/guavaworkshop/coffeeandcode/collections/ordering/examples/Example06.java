package com.totvs.guavaworkshop.coffeeandcode.collections.ordering.examples;

import java.util.Comparator;
import java.util.List;
import com.google.common.base.Charsets;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.totvs.agridatagenerator.framework.readers.AgriDataReaderBO;
import com.totvs.agridatagenerator.vo.FazendaVO;

public class Example06 {

	public static void main(String[] args) {

		List<FazendaVO> fazendas = AgriDataReaderBO.readFrom("C:\\Users\\guilherme.farto\\Desktop\\farm-dataset.json", Charsets.UTF_8);

		Ordering<FazendaVO> ordering = Ordering.from(new Comparator<FazendaVO>() {

			@Override
			public int compare(FazendaVO f1, FazendaVO f2) {
				return Ints.compare(f1.getTalhoes().size(), f2.getTalhoes().size());
			}
		});

		List<FazendaVO> maioresFazendas = ordering.greatestOf(fazendas, 3);

		List<FazendaVO> menoresFazendas = ordering.leastOf(fazendas, 3);

		for (FazendaVO maiorFazenda : maioresFazendas) {
			System.out.println(maiorFazenda.getCodigo() + " - " + maiorFazenda.getDescricao() + " - " + maiorFazenda.getTalhoes().size() + " talhões - " + maiorFazenda.getEquipamentos().size() + " equipamentos");
		}

		for (FazendaVO menorFazenda : menoresFazendas) {
			System.out.println(menorFazenda.getCodigo() + " - " + menorFazenda.getDescricao() + " - " + menorFazenda.getTalhoes().size() + " talhões - " + menorFazenda.getEquipamentos().size() + " equipamentos");
		}

	}

}
