import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = n;
        while(i>0){
            sum += i;
            i--;
        }
        System.out.print("Sum is: ");
        System.out.println(sum);
        sc.close();
    }
}
