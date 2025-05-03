import java.util.*;
public class assques2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char ch = sc.next().toLowerCase().charAt(0);

        if( ch>='a' && ch<='z'){
            if("aeiou".indexOf(ch) != -1){
                System.out.println("This is a vowel");
            }
            else{
                System.out.println("This is not a vowel");
            }
        }


    }
}