package codingtest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   String a = sc.next();
		   
		   StringBuilder output = new StringBuilder();
	        for (int i = 0; i < a.length(); i++) {
	            char c = a.charAt(i);
	            if (Character.isUpperCase(c)) {
	                output.append(Character.toLowerCase(c));
	            } else if (Character.isLowerCase(c)) {
	                output.append(Character.toUpperCase(c));
	            } else {
	                output.append(c);
	            }
	        }

	        System.out.println(output.toString());
	}
	}

