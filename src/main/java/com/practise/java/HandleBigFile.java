package com.practise.java;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HandleBigFile {
	public static void main(String args[]) throws URISyntaxException, IOException {
//		String str = "Hello";
//		List<String> vowels = List.of("a", "e", "i", "o", "u");
//		Map<String, Long> map2 = str.chars().mapToObj(c -> String.valueOf((char) c))
//				.filter(word -> vowels.contains(word))
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		map2.entrySet().forEach(System.out::println);
		
		Path path1 = Paths.get(HandleBigFile.class.getResource("sample.txt").toURI());
		Files.lines(path1).forEach(System.out::println);

	}
}
