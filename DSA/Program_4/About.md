### Question - Design, Develop and Implement a Program in C for converting an Infix Expression to Postfix Expression. Program should support for both parenthesized and free parenthesized expressions with the operators: +, -, *, /, %( Remainder), ^ (Power) and alphanumeric operands.

## ABOUT THE EXPERIMENT:

**Infix**: Operators are written in-between their operands. Ex: X + Y 

**Prefix**: Operators are written before their operands. Ex: +X Y 

**postfix**: Operators are written after their operands. Ex: XY+

Infix to prefix conversion Expression = (A+B^C)*D+E^5 
- Step 1. Reverse the infix expression. 
 ##### 5^E+D*)C^B+A(
- Step 2. Make Every '(' as ')' and every ')' as '('
##### 5^E+D*(C^B+A)
- Step 3. Convert expression to postfix form.
- Step 4. Reverse the expression.
##### +*+A^BCD^E 
- Step 5. Result
##### +*+A^BCD^E5

##### A+(B*C-(D/E-F)*G)*H
