package question1;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {

	//function to check balancing brackets
	static boolean checkingBalancedBrackets(String bracketString)
	{
		Stack<Character> characterStack = new Stack<Character>();
		
		for(int i = 0;i<bracketString.length();i++)
		{
			char character = bracketString.charAt(i);
			
			if(character == '(' || character == '[' || character == '{')
			{
				characterStack.push(character);
				continue;
			}
			
			if(characterStack.isEmpty())
				return false;
			
			char c;
			
			switch(character)
			{
				case ')':
					c = characterStack.pop();
					if(c == '{' || c == '[')
						return false;
					break;
				
				case '}':
					c = characterStack.pop();
					if(c == '(' || c == '[')
						return false;
					break;
				
				case ']':
					c = characterStack.pop();
					if(c == '(' || c == '{')
						return false;
					break;
				
			}
		}
		 
		return (characterStack.isEmpty());
	}
	
	//Driver
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the bracket expression to check for balanced brackets");
		Scanner sc = new Scanner(System.in);
		String bracketString = sc.nextLine();
		
		Boolean output;
		
		output = checkingBalancedBrackets(bracketString);
		
		if(output)
		{
			System.out.println("The entered string has balanced brackets");
	
		}
		else
			
			System.out.println("The entered string doesn't contain balanced brackets");
	
		sc.close();
	}

}
