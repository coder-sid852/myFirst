import java.util.*;

public class countDigits {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if(num != 0){
            num= num/10;
            ++count;
        }
        
        System.out.println(count);
        sc.close();
    }
}
