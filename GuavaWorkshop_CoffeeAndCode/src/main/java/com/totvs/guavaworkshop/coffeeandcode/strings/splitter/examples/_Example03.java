package com.totvs.guavaworkshop.coffeeandcode.strings.splitter.examples;

import java.util.List;
import com.google.common.base.Splitter;

public class _Example03 {

	public static void main(String[] args) {

		String info = "Cana-de-Açúcar,    , Soja,    , Algodão";

		List<String> culturas = Splitter.on(", ").trimResults().omitEmptyStrings().splitToList(info);

		System.out.println(culturas.size());
		System.out.println(culturas);

	}

}
