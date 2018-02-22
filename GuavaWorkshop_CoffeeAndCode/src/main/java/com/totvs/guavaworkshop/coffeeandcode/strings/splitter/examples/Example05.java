package com.totvs.guavaworkshop.coffeeandcode.strings.splitter.examples;

import java.util.List;
import com.google.common.base.Splitter;

public class Example05 {

	public static void main(String[] args) {

		String info = "Guava Workshop - TOTVS Coffee and Code";

		List<String> result = Splitter.fixedLength(5).splitToList(info);

		System.out.println(result.size());
		System.out.println(result);

	}

}
