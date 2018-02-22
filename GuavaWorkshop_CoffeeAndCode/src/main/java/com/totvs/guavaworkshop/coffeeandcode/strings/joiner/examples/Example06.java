package com.totvs.guavaworkshop.coffeeandcode.strings.joiner.examples;

import java.util.Arrays;
import java.util.List;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;

public class Example06 {

	public static void main(String[] args) {

		List<String> operacoes = Arrays.asList("1000", "1002", null, "1005", "1008");

		String where = Joiner.on(" OR ").skipNulls().join(Iterables.transform(operacoes, new Function<String, String>() {

			public String apply(String value) {
				return "CD_OPERACAO = " + value;
			}
		}));

		String sql = "... WHERE " + where + " ...";

		System.out.println(sql);

	}

}
