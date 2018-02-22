package com.totvs.guavaworkshop.coffeeandcode.strings.joiner.examples;

import java.util.LinkedHashMap;
import java.util.Map;
import com.google.common.base.Joiner;

public class Example04 {

	public static void main(String[] args) {

		Map<String, String> data = new LinkedHashMap<String, String>();
		data.put("Fazenda #1", "Cana-de-A��car");
		data.put("Fazenda #2", "Soja");
		data.put("Fazenda #3", "Algod�o");

		String info = Joiner.on(", ").withKeyValueSeparator(" = ").join(data);

		System.out.println(info);

	}

}
