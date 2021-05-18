package com.codingTest;

import java.util.HashMap;
import java.util.stream.Stream;

import com.coding.models.ParsedData;

public class Main {

	public static void main(String[] args) {

		ParsedData data = parseData("102992123 cpu=10, mem=15, disk=10");

		System.out.println("Timestamp: " + data.getTimestamp());
		System.out.println("cpu: " + data.getAttributes().get("cpu"));
		System.out.println("mem: " + data.getAttributes().get("mem"));
		System.out.println("disk: " + data.getAttributes().get("disk"));
		
	}
	
	public static ParsedData parseData(String input) {

		input = input.replaceAll(",", "");
		String splits[] = input.split(" ");

		ParsedData data = new ParsedData();
		data.setTimestamp(Long.parseLong(splits[0]));

		if (data.getAttributes() == null)
			data.setAttributes(new HashMap<String, String>());

		Stream.of(splits).skip(1).forEach(item -> {
			String items[] = item.split("=");
			data.getAttributes().put(items[0], items[1]);
		});

		return data;

	}

}
