/**
 * 
 */
package com.suma.practice.general;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * @author sumandutta
 *
 */
public class Spellchecker {

	/**
	 * 
	 */
	public Spellchecker() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws IOException
	{
		URL url = new URL("http://andrew.cmu.edu/course/15-121/dictionary.txt");
		Scanner sc = new Scanner( url.openStream() );

		HashSet<String> dict =  new HashSet<String>();

		Map<Integer,Integer>map = new HashMap<Integer,Integer> ();
		
		while( sc.hasNext() ) dict.add(sc.next());
		sc.close();

		sc = new Scanner( new File("/Users/sumandutta/git/Practice-Algos/src/com/suma/practice/general/Spellchecker.java") );
		while( sc.hasNextLine() )
		{
			String[] tokens = sc.nextLine().split("\\W");
			for(String token : tokens)
			   if (token.length() > 1 && !dict.contains(token.toLowerCase()))
			      System.out.println(token);
		}
	}

}
