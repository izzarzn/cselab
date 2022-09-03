import java.util.*;

class Student{

String USN,Name,Branch,Phone;
Scanner scan = new Scanner(System.in);

void read(){

  System.out.printf("Enter student Details");
  System.out.printf("Enter USN");
  USN = scan.next();
  System.out.printf("Enter Branch");
  Name = scan.next();
  System.out.printf("Enter Name");
  Branch = scan.next();
  System.out.printf("Enter Phone");
  Phone = scan.next();
  
}
  void display(){
    System.out,print(USN+"\t"+Name+"\t"+Branch+"\t"+Phone);
  }
}

class StudentDetails{
  
public static void main( String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the number of student details to be created");
  int n = scan.nexrInt();
  
  //Read number of students into array
  for(i=0;i<n;i++){
    s[i] = new student();
    s[i].read();
  
 }
}
  
  
