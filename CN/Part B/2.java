import java.util.Scanner;
public class BellmanFord {
private int D[];
private int n;
public static final int MAX_VALUE = 999;
public BellmanFord(int n) {
this.n=n;
D = new int[n+1];
}
public void shortest(int s,int A[][]) {
for (int i=1;i<=n;i++) D[i]=MAX_VALUE;
D[s] = 0;
for(int k=1;k<=n-1;k++)
for(int i=1;i<=n;i++)
for(int j=1;j<=n;j++) if(A[i][j]!=MAX_V ALUE)
{
if(D[j]>D[i]+A[i][j]) D[j]=D[i]+A[i][j];
}
for(int i=1;i<=n;i++)
System.out.println("Distance of source " + s + " to "+ i + " is " + D[i]); }
public static void main(String[ ] args)
{
int n=0,s;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of vertices");
n = sc.nextInt();
int A[][] = new int[n+1][n+1];
System.out.println("Enter the Weighted matrix");
for(int i=1;i<=n;i++)
for(int j=1;j<=n;j++)
{
A[i][j]=sc.nextInt();
if(i==j)
{
A[i][j]=0;
continue;
}
if(A[i][j]==0)
A[i][j]=MAX_V ALUE;
}
System.out.println("Enter the source vertex");
s=sc.nextInt();
BellmanFord b = new BellmanFord(n);
b.shortest(s,A);
sc.close();
}
}