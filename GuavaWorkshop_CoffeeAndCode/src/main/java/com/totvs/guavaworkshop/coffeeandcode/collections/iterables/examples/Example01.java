package com.totvs.guavaworkshop.coffeeandcode.collections.iterables.examples;

import java.util.Arrays;
import java.util.List;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.totvs.agridatagenerator.vo.EquipamentoVO;

public class Example01 {

	public static void main(String[] args) {

		List<EquipamentoVO> equipamentos1 = Lists.newLinkedList(Arrays.asList(new EquipamentoVO("1000"), new EquipamentoVO("3000")));
		List<EquipamentoVO> equipamentos2 = Lists.newLinkedList(Arrays.asList(new EquipamentoVO("2000"), new EquipamentoVO("4000")));
		List<EquipamentoVO> equipamentos3 = Lists.newLinkedList(Arrays.asList(new EquipamentoVO("4000"), new EquipamentoVO("1000")));

		Iterable<EquipamentoVO> equipamentos = Iterables.concat(equipamentos1, equipamentos2, equipamentos3);

		System.out.println(Iterables.size(equipamentos));
		System.out.println(equipamentos);

		System.out.println(Iterables.frequency(equipamentos, new EquipamentoVO("1000"))); // Requires equals() for EquipamentoVO

		Iterable<List<EquipamentoVO>> equipamentosParticionados = Iterables.partition(equipamentos, 3);

		System.out.println(Iterables.size(equipamentosParticionados));

		List<EquipamentoVO> equipamentosParticao = Iterables.get(equipamentosParticionados, 0);

		EquipamentoVO equipamentoPrimeiro = Iterables.getFirst(equipamentos, null);
		EquipamentoVO equipamentoUltimo = Iterables.getLast(equipamentos, null);

		Iterable<EquipamentoVO> equipamentosLimite = Iterables.limit(equipamentos, 4);

		// NoSuchElementException - if the iterable is empty
		// IllegalArgumentException - if the iterable contains multiple elements
		EquipamentoVO equipamentoUnico = Iterables.getOnlyElement(equipamentos);

	}

}
