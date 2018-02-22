package com.totvs.guavaworkshop.coffeeandcode.strings.splitter.examples;

import java.util.List;
import com.google.common.base.Splitter;

public class Example02 {

	public static void main(String[] args) {

		String info = "Cana-de-A��car,Soja.Algod�o|Milho^Caf�";

		List<String> culturas = Splitter.onPattern("[,.|^]").omitEmptyStrings().splitToList(info);

		System.out.println(culturas.size());
		System.out.println(culturas);

	}

}
