package com.totvs.guavaworkshop.coffeeandcode.strings.splitter.examples;

import com.google.common.base.Splitter;

public class Example01 {

	public static void main(String[] args) {

		String info = "Cana-de-A��car, , Soja, , Algod�o";

		Iterable<String> culturas = Splitter.on(", ").omitEmptyStrings().split(info);

		System.out.println(culturas);

	}

}
