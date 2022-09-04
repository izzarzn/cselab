import java.util.*;
class MergeSort{
  final static int MAX = 200000;
  static int[] a = new int[MAX];
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = scan.nextInt();
    Random random = new Random();
    System.out.println("Enter the array elemrnts:")
      for(i=0;i<n;i++)
        //a[i] = scan.nextInt();
        a[i] = random.nextInt(10000);
    System.out.println(a[i] +" ");
  }long starttime = System.nanoTime();
  MergeSortAlgorihm(0,n-1);
  long stoptime = System.nanoTime();
    
  
