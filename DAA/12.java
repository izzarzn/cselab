package javaprogram;
import java.util.Scanner;
public class Hamiltonian {
static int []x=new int[25];
static void next_vertex(int g[][],int n,int k)
{
	int j;
	while(true)
	{    x[k]=(x[k]+1)%(n+1);
	if(x[k]==0)
		return;
	if(g [ x [ k-1 ] ] [ x[k] ]!=0)
	{
		for(j=1;j<=k-1;j++)
		{
			if(x[j]==x[k])
				break;
		}
		if(j==k)
			if( (k<n)||( (k==n)&&(g[ x [n] ] [x[1]]!=0 ) ) )
				return;
	} } } 
static void h_cycle(int g[][],int n,int k)
{
	int i;
	while(true)
	{
		next_vertex(g,n,k);
		if(x[k]==0)
			return;
		if(k==n)
		{
			System.out.println("\n");
			for(i=1;i<=n;i++)
				System.out.print(x[i]+"-->");
			System.out.print(x[1]);
		}
		else
			h_cycle(g,n,k+1);
	} }
	public static void main(String[] args) {
		int i,j,n;
		int[][]g=new int[25][25];
		Scanner read = new Scanner(System.in);
		System.out.println("enter the number of vertex of the graph");
		n=read.nextInt();
		System.out.println("enter the path adjacency matrix");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				g[i][j]=read.nextInt();
				x[i]=0;
			} }
		x[1]=1;
		System.out.println("\n Hamiltonian cycle are");
		h_cycle(g,n,2);
			} }
