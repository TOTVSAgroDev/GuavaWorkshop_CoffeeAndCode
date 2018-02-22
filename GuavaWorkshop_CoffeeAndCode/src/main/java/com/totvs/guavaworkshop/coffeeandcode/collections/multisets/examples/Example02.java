package com.totvs.guavaworkshop.coffeeandcode.collections.multisets.examples;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Example02 {

	// With Guava

	public static void main(String[] args) {

		// HashMultiset, TreeMultiset, LinkedHashMultiset, ConcurrentHashMultiset, ImmutableMultiset
		Multiset<String> pragas = HashMultiset.create();

		adicionar(pragas, "Broca-da-cana");
		adicionar(pragas, "Carrapicho");
		adicionar(pragas, "Carrapicho");
		adicionar(pragas, "Broca-da-cana");
		adicionar(pragas, "Cigarrinha-das-raízes");
		adicionar(pragas, "Cupim");
		adicionar(pragas, "Broca-da-cana");
		adicionar(pragas, "Cupim");

		System.out.println(pragas.size());
		System.out.println(pragas);

		System.out.println(pragas.count("Broca-da-cana")); // 3
		pragas.remove("Broca-da-cana");
		System.out.println(pragas.count("Broca-da-cana")); // 2

		System.out.println(pragas.count("Besouro")); // 0
		System.out.println(pragas.contains("Besouro")); // false

		pragas.setCount("Besouro", 5);

		System.out.println(pragas.count("Besouro")); // 0
		System.out.println(pragas.contains("Besouro")); // false

		System.out.println(pragas.elementSet()); // like keySet() for a Map

	}

	public static void adicionar(Multiset<String> pragas, String praga) {
		pragas.add(praga);
	}

}
