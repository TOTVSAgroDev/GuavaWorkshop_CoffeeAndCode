package com.totvs.guavaworkshop.coffeeandcode.strings.charmatcher.examples;

import com.google.common.base.CharMatcher;

public class Example03 {

	public static void main(String[] args) {

		String COFFEE_AND_CODE = "   Coffee and Code   ";

		String result = CharMatcher.whitespace().trimLeadingFrom(COFFEE_AND_CODE);

		System.out.println("[" + result + "]");

		result = CharMatcher.whitespace().trimTrailingFrom(COFFEE_AND_CODE);

		System.out.println("[" + result + "]");

		result = CharMatcher.whitespace().trimFrom(COFFEE_AND_CODE);

		System.out.println("[" + result + "]");

	}

}
