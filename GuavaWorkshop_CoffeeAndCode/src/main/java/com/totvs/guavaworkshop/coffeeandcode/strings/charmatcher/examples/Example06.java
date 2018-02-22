package com.totvs.guavaworkshop.coffeeandcode.strings.charmatcher.examples;

import com.google.common.base.CharMatcher;
import com.google.common.base.Predicate;

public class Example06 {

	public static void main(String[] args) {

		String COFFEE_AND_CODE_2018 = " * Coffee and Code 2018 * ";

		String result = CharMatcher.is('*').or(CharMatcher.is(' ').or(CharMatcher.is('C'))).removeFrom(COFFEE_AND_CODE_2018);

		System.out.println(result);

		result = CharMatcher.forPredicate(new Predicate<Character>() {

			@Override
			public boolean apply(Character c) {
				return c == '*' || c == ' ' || c == 'C';
			}

		}).removeFrom(COFFEE_AND_CODE_2018);

		System.out.println(result);

	}

}
