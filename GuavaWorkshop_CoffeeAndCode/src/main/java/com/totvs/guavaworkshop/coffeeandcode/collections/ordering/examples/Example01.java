package com.totvs.guavaworkshop.coffeeandcode.collections.ordering.examples;

import java.util.List;
import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import com.totvs.agridatagenerator.framework.readers.AgriDataReaderBO;
import com.totvs.agridatagenerator.framework.utils.NumberUtil;
import com.totvs.agridatagenerator.vo.FazendaVO;

public class Example01 {

	public static void main(String[] args) {

		List<FazendaVO> fazendas = AgriDataReaderBO.readFrom("C:\\Users\\guilherme.farto\\Desktop\\farm-dataset.json", Charsets.UTF_8);

		Ordering<FazendaVO> ordering = Ordering.natural().nullsFirst().onResultOf(new Function<FazendaVO, Long>() {

			@Override
			public Long apply(FazendaVO fazenda) {
				return NumberUtil.asLong(fazenda.getCodigo());
			}
		});

		System.out.println(ordering.isOrdered(fazendas));

		List<FazendaVO> fazendasOrdenadas = ordering.sortedCopy(fazendas);

		for (FazendaVO fazenda : fazendasOrdenadas) {
			System.out.println(fazenda.getCodigo() + " - " + fazenda.getDescricao());
		}

	}

}
