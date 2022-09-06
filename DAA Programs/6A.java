mport java.util.Scanner;
public class Knap {
	public static void main(String[] args) {
		int v[][] = new int [30][30],
				w[]=new int [10],
				p[]=new int[10];
		Scanner read = new Scanner(System.in);
		int i,j;
		System.out.println("enter the total number of objects: ");
		int n = read.nextInt();
		System.out.println("enter weights of each item:");
		for(i=1;i<=n;i++)
			w[i]=read.nextInt();
		System.out.println("enter the profits of each items: ");
		for(i=1;i<=n;i++)
			p[i]=read.nextInt();
		System.out.println("enter the knapsack capacity:");
		int m= read.nextInt();
		displayinfo(m,n,w,p);
		knapsack(m,n,w,p,v);
		System.out.println("the contents of knapsack are:");
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=m;j++)
			{
				System.out.print(v[i][j]+"  ");
			} }
		optimal(m,n,w,v);
	}
	static void displayinfo(int m,int n,int w[],int p[])
	{
		System.out.println("enter information about knapsack probklems are: ");
		System.out.println("\n ITEM \n WEIGHT \n PROFIT");
		for(int i=1;i<=n;i++)
			System.out.println(i+"\t"+w[i]+"\t"+p[i]);
		System.out.println("capacity ="+m);
	}
	static void knapsack(int n,int m, int w[],int p[],int v[][])
	{
		for(int i=0;i<=n;i++)
		for(int j=0;j<=m;j++)
		if(i==0||j==0)
			v[i][j]=0;
		else 
			if(j<w[i])
			v[i][j]=v[i-1][j];
		else
			v[i][j]= max(v[i-1][j] , v[i-1][j-w[i]] +p [ i] );
	} 
static int max(int i,int j)
{
	if(i>j)
		return i;
	else
		return j;
}
static void optimal(int m,int n, int w[],int v[][])
{
	int i=n,j=m,item=0;
	int x[] = new int [10];
	while(i!=0 && j!=0)
	{
		if (v[i][j]!= v[i-1][j])
		{
			x[i]=1;
			j=j-w[i];
		}
		i=i-1;
	}
	System.out.println("optimal solution is: "+v[n][m]);
	System.out.println("selected items are: ");
	for(i=1;i<=n;i++)
		if(x[i]==1)
		{
			System.out.print(i+ " ");
			item = 1;
		}
	if (item==0)
		System.out.println("sorry! no items can be placed");
	} }
