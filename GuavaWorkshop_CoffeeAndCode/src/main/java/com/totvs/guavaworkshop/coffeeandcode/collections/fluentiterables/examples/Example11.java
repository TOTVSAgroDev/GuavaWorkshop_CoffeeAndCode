package com.totvs.guavaworkshop.coffeeandcode.collections.fluentiterables.examples;

import java.util.Comparator;
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

public class Example11 {

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

	public static final Function<FazendaVO, Iterable<TalhaoVO>> TRANSFORM_TALHAO_ALGODAO = new Function<FazendaVO, Iterable<TalhaoVO>>() {

		@Override
		public Iterable<TalhaoVO> apply(FazendaVO fazenda) {
			ImmutableList<TalhaoVO> talhoesFiltrados = FluentIterable.from(fazenda.getTalhoes()).filter(new Predicate<TalhaoVO>() {

				@Override
				public boolean apply(TalhaoVO talhao) {
					return "Algodão".equals(talhao.getCultura().getDescricao());
				}
			}).toList();

			return talhoesFiltrados;
		}
	};

	public static void main(String[] args) {

		List<FazendaVO> fazendas = AgriDataReaderBO.readFrom("C:\\Users\\guilherme.farto\\Desktop\\farm-dataset.json", Charsets.UTF_8);

		ImmutableList<TalhaoVO> talhoesFiltrados = FluentIterable.from(fazendas).filter(FILTER_FAZENDAS_TALHAO_ALGODAO).transformAndConcat(TRANSFORM_TALHAO_ALGODAO).toSortedList(new Comparator<TalhaoVO>() {

			@Override
			public int compare(TalhaoVO t1, TalhaoVO t2) {
				return t1.getAreaProdutiva().compareTo(t2.getAreaProdutiva());
			}
		}).reverse().subList(0, 3);

		System.out.println(talhoesFiltrados.size());
		System.out.println(talhoesFiltrados);

		for (TalhaoVO talhao : talhoesFiltrados) {
			System.out.println("  " + talhao.getCodigo() + " - " + talhao.getCultura() + " - " + talhao.getAreaProdutiva());
		}

	}

}
