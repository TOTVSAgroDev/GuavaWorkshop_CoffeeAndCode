package com.totvs.guavaworkshop.coffeeandcode.collections.multimaps.examples;

import java.util.List;
import java.util.Map;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

public class Example02 {

	// With Guava

	public static void main(String[] args) {

		// ArrayListMultimap, HashMultimap, LinkedListMultimap, LinkedHashMultimap, TreeMultimap, ImmutableListMultimap, ImmutableSetMultimap
		ListMultimap<String, String> fazendasCulturas = LinkedListMultimap.create();

		adicionar(fazendasCulturas, "1000", "Algodão");
		adicionar(fazendasCulturas, "1000", "Soja");
		adicionar(fazendasCulturas, "1000", "Milho");
		adicionar(fazendasCulturas, "2000", "Cana-de-Açúcar");
		adicionar(fazendasCulturas, "2000", "Café");

		System.out.println(fazendasCulturas.size());
		System.out.println(fazendasCulturas);
		System.out.println(fazendasCulturas.get("1000"));
		System.out.println(fazendasCulturas.keySet());

		Map<String, List<String>> asMap = Multimaps.asMap(fazendasCulturas);

		System.out.println(asMap);

	}

	public static void adicionar(Multimap<String, String> fazendasCulturas, String fazenda, String cultura) {
		fazendasCulturas.put(fazenda, cultura);
	}

}
