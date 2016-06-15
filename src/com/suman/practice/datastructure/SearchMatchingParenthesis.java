/**
 * 
 */
package com.suman.practice.datastructure;

import java.util.Stack;

/**
 * @author sumandutta
 *
 */
public class SearchMatchingParenthesis {

	
/*	public static boolean checkParenthesis(String str){
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<str.length();i++){
			char current = str.charAt(i);
			if(current=='{' || current=='('|| current=='['){
				stack.push(current);
			}
			
			if(current=='}' || current==')'|| current==']'){
				
				if(stack.isEmpty()){
					return false;
				}
				char last = stack.peek();
				
				if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
	                stack.pop();
	            else 
	                return false;
			}
		}
		
		return stack.isEmpty();
	}
	

	
	public static void main(String...okok) {
		// TODO Auto-generated method stub
		System.out.println(checkParenthesis("{[[(]]})"));
	}
*/

	
	 private static final char L_PAREN    = '(';
	    private static final char R_PAREN    = ')';
	    private static final char L_BRACE    = '{';
	    private static final char R_BRACE    = '}';
	    private static final char L_BRACKET  = '[';
	    private static final char R_BRACKET  = ']';

	    public static boolean isBalanced(String s) {
	        Stack<Character> stack = new Stack<Character>();
	        for (int i = 0; i < s.length(); i++) {

	            if      (s.charAt(i) == L_PAREN)   stack.push(L_PAREN);

	            else if (s.charAt(i) == L_BRACE)   stack.push(L_BRACE);

	            else if (s.charAt(i) == L_BRACKET) stack.push(L_BRACKET);

	            else if (s.charAt(i) == R_PAREN) {
	                if (stack.isEmpty())        return false;
	                if (stack.pop() != L_PAREN) return false;
	            }

	            else if (s.charAt(i) == R_BRACE) {
	                if (stack.isEmpty())        return false;
	                if (stack.pop() != L_BRACE) return false;
	            }

	            else if (s.charAt(i) == R_BRACKET) {
	                if (stack.isEmpty())        return false;
	                if (stack.pop() != L_BRACKET) return false;
	            }

	            // ignore all other characters

	        }
	        return stack.isEmpty();
	    }


	    public static void main(String[] args) {
	        String s = "[()]{}{{[()()}]()}";  // push > [ ( { { { [zz99(
	        System.out.println(isBalanced(s));
	    }

}
