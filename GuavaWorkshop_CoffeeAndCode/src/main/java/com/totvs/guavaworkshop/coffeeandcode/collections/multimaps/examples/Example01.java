package com.totvs.guavaworkshop.coffeeandcode.collections.multimaps.examples;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Example01 {

	// Without Guava

	public static void main(String[] args) {

		Map<String, List<String>> fazendasCulturas = new LinkedHashMap<String, List<String>>();

		fazendasCulturas = adicionar(fazendasCulturas, "1000", "Algodão");
		fazendasCulturas = adicionar(fazendasCulturas, "1000", "Soja");
		fazendasCulturas = adicionar(fazendasCulturas, "1000", "Milho");
		fazendasCulturas = adicionar(fazendasCulturas, "2000", "Cana-de-Açúcar");
		fazendasCulturas = adicionar(fazendasCulturas, "2000", "Café");

		System.out.println(fazendasCulturas);

	}

	public static Map<String, List<String>> adicionar(Map<String, List<String>> fazendasCulturas, String fazenda, String cultura) {
		if (fazendasCulturas == null) {
			fazendasCulturas = new LinkedHashMap<String, List<String>>();
		}

		List<String> culturas = null;

		if (fazendasCulturas.containsKey(fazenda)) {
			culturas = fazendasCulturas.get(fazenda);
		} else {
			culturas = new LinkedList<String>();
		}

		culturas.add(cultura);

		fazendasCulturas.put(fazenda, culturas);

		return fazendasCulturas;
	}

}
