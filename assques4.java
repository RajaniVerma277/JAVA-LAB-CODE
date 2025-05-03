import java.util.*;
public class assques4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to reverse");
        int num = sc.nextInt();
        System.out.println("before reverse the number is = "+num);
        int rem;
        int rev=0;
        while(num>0){
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println("after reverse the number is = "+rev);
    }
}