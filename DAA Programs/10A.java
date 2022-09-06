import java.util.Scanner;
public class Floyds {
static int cost[][]=new int[10][10];
public static void flo(int cost[][],int n)
{
	int i,j,k;
	for(k=1;k<=n;k++)
	for(i=1;i<=n;i++)
	for(j=1;j<=n;j++)
	if(i==j)
	cost[i][j]=0;
		else
	cost[i][j]=min(cost[i][j],cost [i][k] + cost[k][j]);
}
public static int min(int a,int b)
{
	return(a<b) ? a:b;
}
	public static void main(String[] args) {
		int n,i,j;
		Scanner read = new Scanner (System.in);
		System.out.println("enter the nuber of vertices:");
		n= read.nextInt();
		System.out.println("enter the cost adjacency matrix:");
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				cost[i][j]=read.nextInt();
		flo(cost,n);
		System.out.println("transitive closure for the given cost matrix is:");
		for(i=1;i<=n;i++)
		{ 
			System.out.println();
			for(j=1;j<=n;j++)
	System.out.print("\t"+cost[i][j]);
	} }  }
