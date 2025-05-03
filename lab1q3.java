public class lab1q3{
    public static void main(String[] args) {
        try {
            int a = 20;
            int b= 0;
            int r=a/b;
            System.err.println(r);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            int x =5;
            int y= 10;
            int s =x+y;
            System.out.println(s);
        }
    }
}