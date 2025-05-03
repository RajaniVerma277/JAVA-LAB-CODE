import java.util.*;
public class assques3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number please");
        int num = sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("Number is multiple of 3 and 5");
        }
        else{
            System.out.println("Number is not multiple of 3 and 5");
        }
    }
}