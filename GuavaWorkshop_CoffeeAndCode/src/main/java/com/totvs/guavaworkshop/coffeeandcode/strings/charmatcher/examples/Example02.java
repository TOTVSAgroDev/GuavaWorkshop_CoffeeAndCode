package com.totvs.guavaworkshop.coffeeandcode.strings.charmatcher.examples;

import com.google.common.base.CharMatcher;

public class Example02 {

	public static void main(String[] args) {

		String COFFEE_AND_CODE = "   Coffee and Code   ";

		String result = CharMatcher.javaUpperCase().retainFrom(COFFEE_AND_CODE);

		System.out.println("[" + result + "]");

		result = CharMatcher.javaUpperCase().removeFrom(COFFEE_AND_CODE);

		System.out.println("[" + result + "]");

	}

}
