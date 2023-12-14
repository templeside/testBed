package com.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		var uri = "C:\\Users\\Jhon\\Desktop\\cogent\\data.txt";
		
		Files.writeString(Path.of(uri), "Welcome to Cogent", StandardOpenOption.CREATE);
		String data = Files.readString(Path.of(uri));
		System.out.println(data);
	}
}
