import java.util.*; public class Leaky {
    static int min(int x,int y) {
    if(x<y) return x; else return y;
    }
    public static void main(String[] args) {
    int drop=0,psent,nsec,cap,pleft=0,i,process;
    int inp[]=new int[25];
    Scanner sc=new Scanner(System.in); System.out.println("Enter The Bucket Size\n"); cap= sc.nextInt();
    System.out.println("Enter The Operation Rate\n");
    process= sc.nextInt();
    System.out.println("Enter The No. Of Seconds You Want To Stimulate\n"); nsec=sc.nextInt();
    for(i=0;i<nsec;i++) {
    System.out.print("Enter The Size Of The Packet Entering At "+ i+1 + " sec");
    inp[i] = sc.nextInt(); }
    System.out.println("\nSecond | Packet Recieved | Packet Sent | Packet Left | Packet Dropped|\n"); System.out.println("------------------------------------------------------------------------\n"); for(i=0;i<nsec;i++)
    {
    pleft+=inp[i];
    if(pleft>cap) {
        drop=pleft-cap;
        pleft=cap; }
        System.out.print(i+1); System.out.print("\t\t"+inp[i]); psent=min(pleft,process); System.out.print("\t\t"+psent); pleft=pleft-psent; System.out.print("\t\t"+pleft); System.out.print("\t\t"+drop); drop=0;
        System.out.println(); }
        for(;pleft!=0;i++) {
        if(pleft>cap) {
        drop=pleft-cap;
        pleft=cap; }
        System.out.print(i+1); System.out.print("\t\t0"); psent=min(pleft,process); System.out.print("\t\t"+psent); pleft=pleft-psent; System.out.print("\t\t"+pleft); System.out.print("\t\t"+drop); System.out.println();
        } 
    }
}