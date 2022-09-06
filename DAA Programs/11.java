import java.util.Scanner;
public class Sumofsubset {
static int c=0;
	public static void main(String[] args) {
		int w[]=new int[10];
		int n,d,i,sum=0;
		int x[]=new int[10];
		Scanner read=new Scanner(System.in);
		System.out.println("enter the number of elements:");
		n=read.nextInt();
		System.out.println("enter the elements in increasing order:");
		for(i=0;i<=n;i++)
			w[i]=read.nextInt();
		System.out.println("enter the value of d:");
		d=read.nextInt();
		for(i=0;i<n;i++)
			sum=sum+w[i];
		if(sum<d||w[0]>d)
		{
			System.out.println("subset not possible!");
			System.exit(0);
		}
		finalsubset(0,0,sum,x,w,d);
		if(c==0)
			System.out.println("subset is not possible!");
		}
	static void finalsubset(int a,int k,int r,int x[],int w[],int d)
	{
		x[k]=1;
		if(a+w[k]==d)
		{c++;
		System.out.print("\n solution "+c+" is {");
		for( int i=0;i<=k;i++)
			if(x[i]==1)
			{
				System.out.print(w[i]+" ");
			}
		System.out.println("}");
			}
		else if (a+w[k]+w[k+1]<=d)
			finalsubset(a+w[k],k+1,r-w[k],x,w,d);
		if((a + r - w[k] ) >= d && ( a + w[k] ) <= d)
				{
			x[k]=0;
			finalsubset(a,k+1,r-w[k],x,w,d);	
		} } }



