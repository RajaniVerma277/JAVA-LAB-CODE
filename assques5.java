import java.util.*;
public class assques5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean isPrime = false;
        System.out.println("enter number to find prime");
        int num = sc.nextInt();
        if(num==0 || num==1){
            System.out.println("Number is not prime");
        }
        if(num==2){
            System.out.println("Number is prime");
        }
        
        for(int i=2;i<num;i++){
            if(num%i == 0){
                isPrime = true;
            }
            else{
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }

    }
}