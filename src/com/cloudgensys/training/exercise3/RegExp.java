package com.cloudgensys.training.exercise3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
	public static void main(String[] args) {
		String msg = "It was the best of tim7es";
		Pattern pattern = Pattern.compile("b(.^(0-9)*)");
		Matcher matcher = pattern.matcher(msg);
		if(matcher.find()){
			System.out.println("Found Match!:"+matcher.group());
		}else{
			System.out.println("No Match found!");
		}
	}
}
