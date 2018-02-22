package com.totvs.guavaworkshop.coffeeandcode.strings.joiner.examples;

import com.google.common.base.Joiner;

public class Example05 {

	public static void main(String[] args) {

		String[] operacoes = { "1000", "1002", null, "1005", "1008" };

		String where = Joiner.on(", ").skipNulls().join(operacoes);

		String sql = "... WHERE CD_OPERACAO IN ( " + where + " ) ...";

		System.out.println(sql);

	}

}
