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

| **Expression** | **Stack**  | **Output**  | **Comment**  |
|:----:|:----:|:----:|:----:|
| 5^E+D*(C^B+A) | Empty | - | Initial |
| ^E+D*(C^B+A) | Empty | 5 | Print |
| E+D*(C^B+A) | ^ | 5 | Push |
| +D*(C^B+A) | ^ | 5E | Push |
| D*(C^B+A) | + | 5E^ | Pop And Push |
| * (C^B+A) | + | 5E^D | Print |
| (C^B+A) | +* | 5E^D | Push |
| C^B+A) | +* ( | 5E^D | Push |
| ^B+A)  | +* ( | 5E^DC | Print |
| B+A) | +* (^ | 5E^DC | Push |
| +A) | +* (^ | 5E^DCB | Print |
| A) | +* (+ | 5E^DCB^ | Pop And Push |
| ) | +* (+ | 5E^DCB^A  | Print |
| End | +* | 5E^DCB^A+ | Pop Until '(' |
| End | Empty | 5E^DCB^A+ * + | Pop Every element |
 
 -----------------------------------------------------------------------------------------------------------------------------------------
