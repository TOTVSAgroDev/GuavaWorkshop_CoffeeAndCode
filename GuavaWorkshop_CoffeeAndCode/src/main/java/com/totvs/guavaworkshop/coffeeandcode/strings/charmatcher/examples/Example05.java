package com.totvs.guavaworkshop.coffeeandcode.strings.charmatcher.examples;

import com.google.common.base.CharMatcher;

public class Example05 {

	public static void main(String[] args) {

		String COFFEE_AND_CODE_2018 = " * Coffee and Code 2018 * ";

		System.out.println(CharMatcher.digit().countIn(COFFEE_AND_CODE_2018));
		System.out.println(CharMatcher.javaLetter().countIn(COFFEE_AND_CODE_2018));
		System.out.println(CharMatcher.javaLetterOrDigit().countIn(COFFEE_AND_CODE_2018));
		System.out.println(CharMatcher.ascii().countIn(COFFEE_AND_CODE_2018));
		System.out.println(CharMatcher.is('*').countIn(COFFEE_AND_CODE_2018));

		System.out.println(CharMatcher.digit().retainFrom(COFFEE_AND_CODE_2018));
		System.out.println(CharMatcher.javaLetter().retainFrom(COFFEE_AND_CODE_2018));
		System.out.println(CharMatcher.javaLetterOrDigit().retainFrom(COFFEE_AND_CODE_2018));
		System.out.println(CharMatcher.ascii().retainFrom(COFFEE_AND_CODE_2018));

	}

}
