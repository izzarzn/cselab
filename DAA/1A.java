import java.util.Scanner; class Student {
String USN, Name, Branch, Phone;
Scanner input = new Scanner(System.in);
void read() {
System.out.println("Enter Student Details");
  System.out.println("Enter USN");
USN = input.nextLine();
System.out.println("Enter Name"); 
  Name = input.nextLine();
System.out.println("Enter Branch");
  Branch = input.nextLine();
System.out.println("Enter Phone");
Phone = input.nextLine(); }
void display() {
System.out.printlnUSN+”\t”+ Name+”\t”+Branch+”\t”+Phone);
} }
class studentdetails {
public static void main(String[] args) {
Scanner input = new Scanner(System.in); 
  System.out.println("Enter number of student details to be created"); 
  int number = input.nextInt();
Student s[] = new Student[number];
// Read student details into array of student objects
for (int i = 0; i < number; i++) 
{ s[i] = new Student();
s[i].read(); }
  // Display student information
System.out.println( "USN\tNAME\tBRANCH\tPHONE"); for (int i = 0; i < number; i++) {
System.out.println();
s[i].display(); }
input.close(); }
}
