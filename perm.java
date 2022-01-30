import java.util.Scanner;

public class perm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter r : ");
        int r = sc.nextInt();
        int num=1, deno = 1;
        int i = n;
        int j = n-r;
        int rFac = 1;
        
        while(i>0){
            num *= i;
            
            i--;
        }
        while(r>0){
            rFac *= r;
            r--;
        }
        while(j>0){
            
            deno *=j;
            
            j--;
        }
        System.out.print("Permutation is: ");
        System.out.println(num/deno);
        System.out.print("Combination is: ");
        System.out.println(num/(rFac*deno));
        sc.close();
    }
}
