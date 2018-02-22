package com.totvs.guavaworkshop.coffeeandcode.strings.splitter.examples;

import java.util.Map;
import com.google.common.base.Splitter;

public class Example04 {

	public static void main(String[] args) {

		String info = "Fazenda #1 = Cana-de-Açúcar, Fazenda #2 = Soja, Fazenda #3 = Algodão";

		Map<String, String> fazendas = Splitter.on(", ").withKeyValueSeparator(" = ").split(info);

		System.out.println(fazendas.size());
		System.out.println(fazendas.keySet());
		System.out.println(fazendas.values());
		System.out.println(fazendas);

	}

}
