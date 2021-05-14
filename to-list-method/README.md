Stream toList() method :

This is a new method added to the Stream interface in Java 16 version.
It converts the Stream into List. 
Elements of List will be in the same order of Stream elements.
New List is immutable. If we try to add or remove elements to the List, it throws UnsupportedOperationException. 

Before toList() method :

Stream<String> cities = Stream.of("Hyderabad", "Bangalore", "Chennai");
		List<String> list = cities.collect(Collectors.toList());
		list.forEach(System.out::println);

After toList() method :

Stream<String> cities = Stream.of("Hyderabad", "Bangalore", "Chennai");
		List<String> list = cities.toList();
		list.forEach(System.out::println);
