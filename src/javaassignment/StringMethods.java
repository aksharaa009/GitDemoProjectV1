package javaassignment;
import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	  		
		   System.out.println("Enter any name:");
		   String name= sc.nextLine();
		   String name1 = sc.nextLine();
		   String index = "pjm Malayi pjm";
		   String index2 = "pjm Malayi pjm";
		   String space = " space ";
		   System.out.println("Length is :" +name.length()); // length of a string 
		   System.out.println("character at three :" +name.charAt(3));
		   System.out.println("substring : " + name.substring(3));
		   System.out.println("substring : " + name.substring(3,4));
		   System.out.println("concat:"+name.concat(name1));
		   System.out.println("index of string"+index.indexOf("malayi"));
		   System.out.println("index of string"+index.indexOf("pj",2));
		   System.out.println("index of string"+index.lastIndexOf("j"));
		   System.out.println("pjm malayi pjm".equals(index));
		   System.out.println(index.toLowerCase());
		   System.out.println(index.toUpperCase());
		   System.out.println(space.trim());
		   System.out.println(index.contains(index2));

	}

}


