package com.totvs.guavaworkshop.coffeeandcode.strings.charmatcher.examples;

import com.google.common.base.CharMatcher;

public class _Example07 {

	public static void main(String[] args) {

		String COFFEE_AND_CODE_2018 = "coffee@and@code";

		boolean result = CharMatcher.javaLowerCase().matchesAllOf(CharMatcher.javaLetterOrDigit().negate().removeFrom(COFFEE_AND_CODE_2018));

		System.out.println(result);

		result = CharMatcher.is('@').matchesAnyOf(COFFEE_AND_CODE_2018);

		System.out.println(result);

		result = CharMatcher.digit().matchesNoneOf(COFFEE_AND_CODE_2018);

		System.out.println(result);

	}

}
