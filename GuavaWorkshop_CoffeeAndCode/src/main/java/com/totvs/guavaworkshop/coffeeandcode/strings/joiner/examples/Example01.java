package com.totvs.guavaworkshop.coffeeandcode.strings.joiner.examples;

import com.google.common.base.Joiner;

public class Example01 {

	public static void main(String[] args) {

		String[] culturas = { "Cana-de-A��car", null, "Soja", null, "Algod�o" };

		String info = Joiner.on(", ").skipNulls().join(culturas);

		System.out.println(info);

		/*
			.join( Object[] parts    )
			.join( Iterable<?> parts )
			.join( Iterator<?> parts )
			.join( Object... parts   )
		 */

	}

}
