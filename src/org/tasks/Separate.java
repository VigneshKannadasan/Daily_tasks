package org.tasks;

public class Separate {
	

	public static void main(String[] args) {
		
		String strMain ="Vignesh123@!#$"; 
		String[] numbers = strMain.split("\\D");
		String[] word = strMain.split("\\d");
		String[]  character= strMain.split("\\W");
		 
			for (int i=0; i <numbers.length; i++){
		    	
		      System.out.println(numbers[i]);
		    }
		
		   
		    for (int i=0; i <word.length; i++){
		    	
			      System.out.println(word[i]);
			    }
		    for (int i=1; i <character.length; i++){
		    	
			      System.out.println(character[i]);
			    }
		  }
		

	}


