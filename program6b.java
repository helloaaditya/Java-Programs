import java.util.*;
public class program6b {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to Withdraw : ");
        int num = sc.nextInt();
        if (num < 1000)
                throw new ArithmeticException("Your bank doesn't allow to Withdraw less than 1000 Rupee!");
            else {
            System.out.println( num + "  withdrawn successfully.");
        }
    }
}


