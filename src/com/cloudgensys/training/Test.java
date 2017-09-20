package com.cloudgensys.training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) throws Exception {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("C:/Users/CG4/Desktop/temp.txt")));
		    StringBuilder totalString = new StringBuilder();
		    String line;
			while ((line = br.readLine()) != null) {
		    	totalString.append(line +"\n");
		    }
		    
			System.out.println(totalString.toString());
			
		    Pattern userNamepattern = Pattern.compile("<userName>(.+?)</userName>");
		    Matcher matcher = userNamepattern.matcher(totalString.toString());
		    if(matcher.find())
		    System.out.println("UserName:"+matcher.group(1));
		    else System.out.println("Username is in incorrect format");
		    
		    Pattern userIdpattern = Pattern.compile("<userId>([a-z0-9]*)</userId>",Pattern.CASE_INSENSITIVE | Pattern.DOTALL | Pattern.MULTILINE);
		    Matcher matcher1 = userIdpattern.matcher(totalString.toString());
		    if(matcher1.find())
		    System.out.println("UserId:"+matcher1.group(1));
		    else System.out.println("UsernId is in incorrect format");
		    
		    Pattern contactpattern = Pattern.compile("<contact>([0-9]*)</contact>");
		    Matcher matcher2 = contactpattern.matcher(totalString.toString());
		    if(matcher2.find())
		    System.out.println("Contact:"+matcher2.group(1));
		    else System.out.println("contact number is in incorrect format than required");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

