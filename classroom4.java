public class classroom4{
    public static void main(String[] args) {
        int num=121;
        int num1=num;
        int rem;
        int rev=0;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        if(rev==num1){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}