package com.totvs.guavaworkshop.coffeeandcode.strings.charmatcher.examples;

import com.google.common.base.CharMatcher;

public class Example04 {

	public static void main(String[] args) {

		String COFFEE_AND_CODE = "   Coffee and Code   ";

		String result = CharMatcher.whitespace().collapseFrom(COFFEE_AND_CODE, '-');

		System.out.println("[" + result + "]");

		result = CharMatcher.whitespace().trimAndCollapseFrom(COFFEE_AND_CODE, '-');

		System.out.println("[" + result + "]");

	}

}
