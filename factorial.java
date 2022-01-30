import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no.: ");
        int a = sc.nextInt();
        int b = 1;
        int i = a;
        
        while(i>0){
            b*= i;
            i--;
        }
        System.out.print("Factorial is: ");
        System.out.println(b);
        sc.close();
    }
}
