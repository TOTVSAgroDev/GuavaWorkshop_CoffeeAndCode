package com.totvs.guavaworkshop.coffeeandcode.strings.charmatcher.examples;

import com.google.common.base.CharMatcher;

public class Example01 {

	public static void main(String[] args) {

		String COFFEE_AND_CODE = "   Coffee and Code   ";

		String result = CharMatcher.javaLowerCase().retainFrom(COFFEE_AND_CODE);

		System.out.println("[" + result + "]");

		result = CharMatcher.javaLowerCase().removeFrom(COFFEE_AND_CODE);

		System.out.println("[" + result + "]");

	}

}
