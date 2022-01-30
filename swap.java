import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no. a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swap:-");
        System.out.printf("a = %d, b = %d\n", a,b);
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("After Swap:-");
        System.out.printf("a = %d, b = %d", a,b);
        
        sc.close();
    }
}
