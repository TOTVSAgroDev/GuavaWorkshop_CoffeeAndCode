package com.totvs.guavaworkshop.coffeeandcode.strings.charmatcher.examples;

import com.google.common.base.CharMatcher;

public class Example09 {

	public static void main(String[] args) {

		String COFFEE_AND_CODE_2018 = "coffee@and^code";

		int result = CharMatcher.is('@').indexIn(COFFEE_AND_CODE_2018);

		System.out.println(result);

		result = CharMatcher.is('c').lastIndexIn(COFFEE_AND_CODE_2018);

		System.out.println(result);

	}

}
