import java.util.*;
public class assques10{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        int count = 0;
        for(int i=1;i<=String.valueOf(num).length();i++){
            count =count+1;
        }
        int rem;
        int sum=0;
        int number = num;
        while( num>0){
            rem = num%10;
            sum = sum + (int)Math.pow(rem , count);
            num = num/10;

        }
        if(sum == number){
            System.out.println("Number is armstrong");

        }
        else{
            System.out.println("Number is not armstrong");

        }
        
    }
}