import java.util.*;

public class deno {
       
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int arr[] = {100,200,500,2000};
        int arr2[] = {20,20,20,20};       
        do {
            System.out.println("Enter the amount - ");
            int amount = sc.nextInt();
            int balance = arr2[0]*arr[0] + arr2[1]*arr[1] + arr2[2]*arr[2] + arr2[3] * arr[3];
       
            if(amount > balance) {
                System.out.println("Not possible");
            }
           
            else if(amount % 100 != 0) {
                System.out.println("Enter in multiples of hundred");
            }
            else {
                int am = amount;
                int d = 3;
                System.out.println("........Notes.......no....");
                while(am > 0) {
   
                    int deno = compute(am,arr[d],arr2[d]);
                    if(deno != 0) {
                    System.out.println("Withdraw- " + arr[d] + "s   \t" + deno);}
                    am -= deno*arr[d];
                    arr2[d] -= deno;
                   
                    d -= 1;
                }
                d = 3;
                while(d > -1) {
                    System.out.println("Remaning " + arr[d] + "s notes " + arr2[d]);
                    d--;
                }
            }
           
       
        }while(true);
           
           
    }
    public static int compute(int total, int a, int b) {
        int t = 0;
       
        while((t*a) <= total && (t<=b)) {
            t++;
        }
        t--;
        if(t < 0) return 0;
        return t;
    }
}
