Description

The code implements a parentheses balancing checker utilizing a stack data structure. It prompts the user to input a mathematical formula and then proceeds to verify if the expression's parentheses are balanced. The algorithm scans the input expression character by character, employing a stack to check for balanced parentheses.

Usage

Input: 
The user is prompted to enter a mathematical formula.

Processing:
The program evaluates the input expression by examining the arrangement of parentheses.

Output:
- If the expression's parentheses are balanced, the program displays the message: "The input expression is balanced!"
- If there's an imbalance in the parentheses, it indicates: "The input expression is not balanced! The first mismatch is found at position [position]!"
  
How it Works

The program operates by iterating through each character in the input string and utilizes a stack to verify the balance of parentheses. If a closing parenthesis is encountered, the code checks whether the corresponding opening parenthesis exists on top of the stack. If the parentheses are unbalanced or if the stack is empty while encountering a closing parenthesis, the program identifies the first mismatch and reports the position.
