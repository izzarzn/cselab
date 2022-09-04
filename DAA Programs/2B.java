import java.util.*;
class Customer {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String name;
    System.out.println("Enter the details in format <DD/MM/YYYY>:);
    name = scan.next();
    StringTokenizer st = new StringTokenizer(name, ",/");                   
    int count = countTokens();
    for(int i=1;i<= count && hasMoreTokens();i++)
        {
          System.out.print(nextToken());
           if(i<count)
             {
                System.out.print(",");
              }
       }
                       }
              }  
