package com.cloudgensys.training.exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;


public class FileHandling {
	
	public static void main(String[] args) throws Exception{

		try (BufferedReader br = new BufferedReader(new FileReader(new File("C:/Users/CG4/Desktop/sample.txt")))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       System.out.println(line);
		    }
		}
		catch(FileNotFoundException e){
			System.out.println("File not found! Please provide correct URL");
		}
	}
}
