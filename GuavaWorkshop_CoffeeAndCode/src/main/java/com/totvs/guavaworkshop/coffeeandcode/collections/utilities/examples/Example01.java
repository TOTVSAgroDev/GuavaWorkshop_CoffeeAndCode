package com.totvs.guavaworkshop.coffeeandcode.collections.utilities.examples;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.totvs.agridatagenerator.vo.EquipamentoVO;

public class Example01 {

	public static void main(String[] args) {

		// Without Guava (< JDK 7)
		// List<EquipamentoVO> equipamentos1 = new LinkedList<EquipamentoVO>();

		// Without Guava (>= JDK 7)
		// List<EquipamentoVO> equipamentos2 = new LinkedList<>();

		// List with Guava
		// Lists.newArrayList, Lists.newLinkedList
		List<EquipamentoVO> equipamentosListGuava = Lists.newLinkedList();

		// Map with Guava
		// Maps.newHashMap, Maps.newLinkedHashMap, Maps.newTreeMap
		Map<EquipamentoVO, Date> equipamentosMapGuava = Maps.newLinkedHashMap();
	}

}
