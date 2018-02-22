package com.totvs.guavaworkshop.coffeeandcode.strings.joiner.examples;

import java.util.Arrays;
import java.util.List;
import com.google.common.base.Joiner;

public class Example03 {

	public static void main(String[] args) {

		List<String> culturas = Arrays.asList("Cana-de-Açúcar", "Soja", "Algodão");

		StringBuilder result = new StringBuilder("");

		result.append("Culturas: ");

		Joiner.on(", ").skipNulls().appendTo(result, culturas);

		System.out.println(result);

	}

}
