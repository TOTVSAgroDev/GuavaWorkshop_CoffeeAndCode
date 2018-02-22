package com.totvs.guavaworkshop.coffeeandcode.strings.splitter.examples;

import java.util.List;
import com.google.common.base.Splitter;

public class Example06 {

	public static void main(String[] args) {

		String info = "Cana-de-Açúcar, Soja, Algodão, Milho, Café";

		List<String> culturas = Splitter.on(", ").limit(3).splitToList(info);

		System.out.println(culturas.size());

		for (String cultura : culturas) {
			System.out.println(cultura);
		}

	}

}
