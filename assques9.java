import java.util.*;
public class assques9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check perfect number");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum +=i;
            }
        }
        if(num == sum){
            System.out.println("Number is perfect number");
        }
        else{
            System.out.println("Number is not perfect number");
        }

    }

}
