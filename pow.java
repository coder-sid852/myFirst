import java.util.Scanner;
public class pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n = sc.nextInt();
        System.out.println("Enter power: ");
        int power = sc.nextInt();
        int result=1;
        for(int i=1; i<=power; i++){
            result *=n;
        }
        System.out.printf("%d to the power of %d is %d", n,power, result);
        sc.close();
    }
}
