package org.mystringprogramms;

public class ReverseWords {

	public static void main(String[] args) {
	
		String originalString ="Hi Hemanth How are u";
		String reverseString="";
      String words[]=originalString.split(" ");
      
      for(int i=0;i<words.length;i++)
      {
    	  String word=words[i];
    	  String reverseWord="";
    	  for(int j=word.length()-1;j>=0;j--)
    	  {
    		  reverseWord=reverseWord+word.charAt(j);
    	  }
    	  reverseString=reverseString+reverseWord+" ";
      }
      System.out.println(reverseString);
	}

}
