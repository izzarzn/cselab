import java.util.Scanner; 
import java.util.Arrays; 
import java.util.Random;
public class QuickSortComplexity { 
  static final int MAX = 200000;
static int[] a = new int[MAX];
public static void main(String[] args) {
Scanner input = new Scanner(System.in); 
  System.out.print("Enter Max array size: ");
int n = input.nextInt();
Random random = new Random(); 
  System.out.println("Enter the array elements: ");
  for (int i = 0; i < n; i++)
// a[i] = input.nextInt();
    // for keyboard entry
a[i] = random.nextInt(10000); // generate
  // random numbers ñ uniform distribution
// a = Arrays.copyOf(a, n); // keep only non zero elements
  // Arrays.sort(a); // for worst-case time complexity
System.out.println("Input Array:"); 
  for (int i = 0; i < n; i++)
System.out.print(a[i] + " "); // set start time
long startTime = System.nanoTime();
  QuickSortAlgorithm(0, n - 1);
long stopTime = System.nanoTime();
  long elapsedTime = stopTime - startTime; 
  System.out.println("\nSorted Array:");
for (int i = 0; i < n; i++) 
  System.out.print(a[i] + " ");
System.out.println();
System.out.println("Time Complexity in ms for
n=" + n + " is: " + (double) elapsedTime / 1000000);
}
public static void QuickSortAlgorithm(int p, int r) {
  int i, j, temp, pivot;
if (p < r) {
i = p;
  j = r + 1;
pivot = a[p]; // mark first element as pivot while (true) {
i++;
while (a[i] < pivot && i < r)
i++; j--;
while (a[j] > pivot) j--;
if (i < j) {
temp = a[i];
a[i] = a[j];
a[j] = temp; } else
break; // partition is over
}
a[p] = a[j];
a[j] = pivot; QuickSortAlgorithm(p, j - 1); 
  QuickSortAlgorithm(j + 1, r);
      }
    }
 }                 
                   
