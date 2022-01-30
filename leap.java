import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Year: ");
        int a = sc.nextInt();
        if(a%4==0){
            System.out.println("It is a leap Year!");
        }else{
            System.out.println("It is not a leap Year!");
        }
        sc.close();
    }
    
}
