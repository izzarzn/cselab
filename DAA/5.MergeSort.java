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
  long elapsedTime = stopTime - startTime; 
  System.out.println("Time Complexity (ms) for n = " +n + " is : " + (double) elapsedTime / 1000000);
  System.out.println("Sorted Array (Merge Sort):");
for (int i = 0; i < n; i++) 
  System.out.print(a[i] + " ");
input.close(); }
public static void MergeSortAlgorithm(int low, int high) {
  int mid;
if (low < high) {
mid = (low + high) / 2;
MergeSortAlgorithm(low, mid);
  MergeSortAlgorithm(mid + 1, high); 
  Merge(low, mid, high);
} }  
public static void Merge(int low, int mid, int high) {
  int[] b = new int[MAX];
int i, h, j, k;
h = i = low;
j = mid + 1;
while ((h <= mid) && (j <= high))
if (a[h] < a[j])
b[i++] = a[h++];
else
b[i++] = a[j++];
if (h > mid)
for (k = j; k <= high; k++)
b[i++] = a[k];
else
for (k = h; k <= mid; k++)
b[i++] = a[k];
for (k = low; k <= high; k++) a[k] = b[k];
  }
}
