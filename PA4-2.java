
import java.util.*;
public class PA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> s= new Stack<Character>();
		try (Scanner keyboard = new Scanner(System.in)) {
			//input
			System.out.print("Enter a math formula: ");
			String input = keyboard.nextLine();
			//algorithm
			boolean balance = true;
			char x = ' ';
			int i = 0;
			for( i  = 0;i < input.length(); i++ ) {
				 x = input.charAt(i);

				if (x == '(' || x== '[' || x=='{') {
					s.push(x);
					continue;
				}else if(x ==')' ){
			      if( s.isEmpty()){
					balance = false;
			       break;
			    }
			      char off = s.pop();
			           if (off != '(' ) {
						balance = false;
						break;
					} 
				}else if(x ==']' ){
			      if( s.isEmpty() ) {
			        balance = false;
			       break;
			    }
			      char off = s.pop();
			        if(off != '['){
						balance = false;
						break;
					}
				}else if(x =='}'){
			      if( s.isEmpty() ){
			        balance = false;
			       break;
			      }
			      char off = s.pop(); 
			          if (off !='{') {
						balance = false;
						break;
					}
				}
				}
				if(balance == true && s.isEmpty()) {
			    	System.out.println("The input expression is balanced!");
				}
			    else {
				    System.out.println("The input expression is not balanced! The first mismatch is found at position "+(i)+"!");
			    }
				keyboard.close();
		}	
		}
	
	}

