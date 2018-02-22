package com.totvs.guavaworkshop.coffeeandcode.strings.charmatcher.examples;

import com.google.common.base.CharMatcher;

public class Example08 {

	public static void main(String[] args) {

		String COFFEE_AND_CODE_2018 = "coffee@and^code";

		String result = CharMatcher.is('@').replaceFrom(COFFEE_AND_CODE_2018, " ");

		System.out.println(result);

		result = CharMatcher.isNot('@').replaceFrom(COFFEE_AND_CODE_2018, " ");

		System.out.println(result);

		result = CharMatcher.is('@').or(CharMatcher.is('^')).replaceFrom(COFFEE_AND_CODE_2018, " ");

		System.out.println(result);

		result = CharMatcher.anyOf("@^").replaceFrom(COFFEE_AND_CODE_2018, " ");

		System.out.println(result);

		result = CharMatcher.noneOf("@^").replaceFrom(COFFEE_AND_CODE_2018, ".");

		System.out.println(result);

	}

}
