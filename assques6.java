import java.util.*;
public class assques6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check number is palindrome or not");
        int num = sc.nextInt();
        int rev = 0;
        int number = num;
        int rem;
        while(num>0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if(number == rev){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}