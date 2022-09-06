import java.util.Scanner;
class Staff {
String StaffID, Name, Phone, Salary;
Scanner input = new Scanner(System.in);
void read() {
System.out.println("Enter StaffID"); 
  StaffID = input.nextLine();
System.out.println("Enter Name"); 
  Name = input.nextLine();
System.out.println("Enter Phone"); 
  Phone = input.nextLine();
System.out.println("Enter Salary");
Salary = input.nextLine(); }
void display() {
System.out.printf("\n%-15s", "STAFFID: ")
  ; 
  System.out.printf("%-15s \n", StaffID); 
  System.out.printf("%-15s", "NAME: ");
  System.out.printf("%-15s \n", Name); 
  System.out.printf("%-15s", "PHONE:");
  System.out.printf("%-15s \n", Phone);
  System.out.printf("%-15s", "SALARY:"); 
  System.out.printf("%-15s \n", Salary);
} }
class Teaching extends Staff { String Domain, Publication;
void read_Teaching() {
super.read(); // call super class read method 
  System.out.println("Enter Domain"); 
  Domain = input.nextLine(); 
  System.out.println("Enter Publication");
  Publication = input.nextLine();
  }
void display_Teaching() {
super.display(); // call super class display() method 
  System.out.printf("%-15s", "DOMAIN:"); 
  System.out.printf("%-15s \n", Domain); 
  System.out.printf("%-15s", "PUBLICATION:"); 
  System.out.printf("%-15s \n", Publication);
} }
class Technical extends Staff { String Skills;
void read_Technical() {
super.read(); // call super class read method 
  System.out.println("Enter Skills");
Skills = input.nextLine();
}
void display_Technical() {
super.display(); // call super class display() method
  System.out.printf("%-15s", "SKILLS:");
  System.out.printf("%-15s \n", Skills);
} }
class Contract extends Staff { String Period;
void read_Contract() {
super.read(); // call super class read method
  System.out.println("Enter Period");
Period = input.nextLine();
}
void display_Contract() {
super.display(); // call super class display()
  method System.out.printf("%-15s", "PERIOD:");
  System.out.printf("%-15s \n", Period);
} }
class Staffdetails {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
  System.out.println("Enter number of staff details to be created"); 
  int n = input.nextInt();
Teaching steach[] = new Teaching[n]; 
  Technical stech[] = new Technical[n];
  Contract scon[] = new Contract[n];
// Read Staff information under 3 categories
for (int i = 0; i < n; i++) {
System.out.println("Enter Teaching staff information"); 
  steach[i] = new Teaching();
steach[i].read_Teaching();
}
for (int i = 0; i < n; i++) {
System.out.println("Enter Technical staff information");
  stech[i] = new Technical();
stech[i].read_Technical();
}
for (int i = 0; i < n; i++) {
System.out.println("Enter Contract staff information"); 
  scon[i] = new Contract();
scon[i].read_Contract();
}
// Display Staff Information
System.out.println("\n STAFF DETAILS: \n");
  System.out.println("-----TEACHING STAFF DETAILS----- ");
for (int i = 0; i < n; i++) {
  steach[i].display_Teaching();
}
System.out.println();
System.out.println("-----TECHNICAL STAFF DETAILS-----");
  for (int i = 0; i < n; i++) {
stech[i].display_Technical(); }
System.out.println();
System.out.println("-----CONTRACT STAFF DETAILS-----"); 
  for (int i = 0; i < n; i++) {
scon[i].display_Contract(); }
input.close(); }
}
