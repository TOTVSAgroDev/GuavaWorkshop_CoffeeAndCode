package com.totvs.guavaworkshop.coffeeandcode.strings.joiner.examples;

import java.util.Arrays;
import java.util.List;
import com.google.common.base.Joiner;

public class Example02 {

	public static void main(String[] args) {

		List<String> culturas = Arrays.asList("Cana-de-A��car", "Soja", "Algod�o");

		String info = Joiner.on(", ").skipNulls().join(culturas);

		System.out.println(info);

	}

}
