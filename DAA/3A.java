import java.util.*;
class exception{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int a,b,res;
    System.out.println("Enter two numbers:");
    a = scan.nextInt();
    b = scan.nextInt();
    try{
      res=a/b;
      System.out.println("The result is:"+res);
    }
    catch(ArithmeticEXception e)
    {
      System.out.println("Divide by zero Error");
    }
  }
}
