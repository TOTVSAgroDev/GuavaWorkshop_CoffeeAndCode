package com.totvs.guavaworkshop.coffeeandcode.collections.fluentiterables.examples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.google.common.base.Charsets;
import com.totvs.agridatagenerator.framework.loggers.AgriDataLoggerBO;
import com.totvs.agridatagenerator.framework.readers.AgriDataReaderBO;
import com.totvs.agridatagenerator.framework.utils.ListUtil;
import com.totvs.agridatagenerator.vo.FazendaVO;

public class Example01 {

	public static void main(String[] args) {

		List<FazendaVO> fazendas = AgriDataReaderBO.readFrom("C:\\Users\\guilherme.farto\\Desktop\\farm-dataset.json", Charsets.UTF_8);

		AgriDataLoggerBO.log(fazendas);

		List<FazendaVO> fazendasFiltradas = filtrar(fazendas, 7);

		System.out.println(fazendasFiltradas.size());
		System.out.println(fazendasFiltradas);

		fazendasFiltradas = filtrarIterator(fazendas, 7);

		System.out.println(fazendasFiltradas.size());
		System.out.println(fazendasFiltradas);

	}

	public static List<FazendaVO> filtrar(List<FazendaVO> fazendas, int quantidadeTalhoes) {
		List<FazendaVO> fazendasFiltradas = new LinkedList<FazendaVO>();

		if (ListUtil.isNotNullOrEmpty(fazendas)) {
			for (FazendaVO fazenda : fazendas) {
				if (ListUtil.isNotNullOrEmpty(fazenda.getTalhoes()) && fazenda.getTalhoes().size() >= quantidadeTalhoes) {
					fazendasFiltradas.add(fazenda);
				}
			}
		}

		return fazendasFiltradas;
	}

	public static List<FazendaVO> filtrarIterator(List<FazendaVO> fazendas, int quantidadeTalhoes) {
		if (ListUtil.isNotNullOrEmpty(fazendas)) {
			for (Iterator<FazendaVO> iFazenda = fazendas.iterator(); iFazenda.hasNext();) {
				FazendaVO fazenda = iFazenda.next();

				if (fazenda.getTalhoes().size() < quantidadeTalhoes) {
					iFazenda.remove();
				}
			}
		}

		return fazendas;
	}

}
