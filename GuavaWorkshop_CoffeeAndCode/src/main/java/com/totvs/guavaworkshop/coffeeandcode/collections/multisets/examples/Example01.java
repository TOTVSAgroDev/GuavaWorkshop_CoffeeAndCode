package com.totvs.guavaworkshop.coffeeandcode.collections.multisets.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example01 {

	// Without Guava

	public static void main(String[] args) {

		Map<String, Integer> pragas = new LinkedHashMap<String, Integer>();

		adicionar(pragas, "Broca-da-cana");
		adicionar(pragas, "Carrapicho");
		adicionar(pragas, "Carrapicho");
		adicionar(pragas, "Broca-da-cana");
		adicionar(pragas, "Cigarrinha-das-raízes");
		adicionar(pragas, "Cupim");
		adicionar(pragas, "Broca-da-cana");
		adicionar(pragas, "Cupim");

		System.out.println(pragas);

		System.out.println(pragas.get("Broca-da-cana")); // 3
		// remover "Broca-da-cana" ???
		System.out.println(pragas.get("Besouro")); // null

		System.out.println(pragas.keySet());

	}

	public static void adicionar(Map<String, Integer> pragas, String praga) {
		Integer contadorPragas = pragas.get(praga);

		if (contadorPragas == null) {
			pragas.put(praga, 1);
		} else {
			pragas.put(praga, contadorPragas + 1);
		}
	}

}
