import java.util.*;
public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n - 1;
        int k, c;
	    for (k = 1; k <= n; k++)
	    {
		    for (c = 1; c <= space; c++)
			    System.out.print(" ");
      	        space--;
		    for (c = 1; c <= 2*k-1; c++)
            System.out.print("* ");
            System.out.println();
        }
	    space = 1;
	    for (k = 1; k <= n - 1; k++)
	    {
		    for (c = 1; c <= space; c++)
			System.out.print(" ");
		    space++;
		    for (c = 1 ; c <= 2*(n-k)-1; c++)
            System.out.print("* ");
		    System.out.println();
	    }
    }
}
