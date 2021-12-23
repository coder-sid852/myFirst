import java.util.*;


public class perfectSq {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // Approach 1
        for (int i = 1; i <= n; i++) {
            if(i*i == n){
                System.out.printf("%d is the perfect sq with sqrt = %d", n, i);
            }
        }
        //Approach 2==== using factors
        int count = 2; // because every no has atleast 2 factors
        if(n%2==0){
            for(int i=2; i<=n/2; i++){
                if(n%i==0){
                    count++;
                }
            }
        }else if(n%3==0){
            for(int i=2; i<=n/3; i++){
                if(n%i==0){
                    count++;
                }
            }
        }
        if(count%2 != 2){
            System.out.printf("%d is perfect square", n);
        }else
        System.out.printf("%d is perfect square", n);
    }
    
}
