import java.util.Scanner;
import java.lang.Math;
public class coordDist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Co-ordinates of First Point: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter Co-ordinates of Second Point: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+") = "+dis);

        sc.close();
    }
}
