import java.util.Scanner;
class Greedy
{
	float w;
	float p;
	float r;
}
public class Kobject {
	static final int max = 20;
	static int n; static int i; static int r;
	static float m;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of objects");
		n = input.nextInt();
		Greedy[]obj = new Greedy[n];
		for(i=0; i<n; i++)
			obj[i] = new Greedy();
		ReadObject (obj);
		knapsack(obj);
	}
	static void ReadObject(Greedy obj[])
	{
		Greedy temp = new Greedy();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the maximum capacity of KnapSack");
		m = input.nextFloat();
		System.out.println("Enter weight");
		for(i=0; i<n; i++) {
			obj[i].w = input.nextFloat();
	}
		System.out.println("Enter Profit");
		for(i=0; i<n; i++) {
			obj[i].p = input.nextFloat();
		}
		for(i=0; i<n; i++) {
			obj[i].r = obj[i].p / obj[i].w;
	}
	for(i=0; i<n-1; i++) {
		for(int j=0; j<n-1-i; j++) {
			if(obj[i].r < obj[j+1].r) {
				temp = obj[j];
	            obj[j] = obj[j+1];
	            obj[j+1] = temp;
		} } } }
  static void knapsack(Greedy obj[])
{ 
	float x[] = new float[max];
	float totalprofit;
	int i; 
	float rc;
	rc = m;
	totalprofit = 0;
	for(i=0; i<n; i++){
		 x[i] = 0;
	for(i=0; i<n; i++)
	{
		if(obj[i].w > rc) {
			break;
		}
		else
		{
			x[i] = 1;
			totalprofit = totalprofit + obj[i].p;
			rc = rc - obj[i].w;
		} }
	System.out.println("i" + i);
	if(i<=n)
		x[i] = rc/obj[i].w;
	totalprofit = totalprofit + obj[i].p * x[i];
	System.out.println("The Solution vector , x[]");
	for(i=0; i<n; i++)
		System.out.println(x[i] + " ");
	System.out.println("\n TotalProfit = " + totalprofit);
} } }

