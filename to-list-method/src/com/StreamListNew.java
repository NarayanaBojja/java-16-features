package com;

import java.util.List;
import java.util.stream.Stream;

public class StreamListNew {

	public static void main(String[] args) {
		Stream<String> cities = Stream.of("Hyderabad", "Bangalore", "Chennai");
		List<String> list = cities.toList();
		list.forEach(System.out::println);
	}

}
