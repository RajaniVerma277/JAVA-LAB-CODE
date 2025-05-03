public class lab1q5 {
    public static void main(String[] args) {
        try{
            int a=20;
            int b=0;
            if(b==0){
                throw new ArithmeticException("sorry can not devide by zero");
            }
            int r=a/b;
            System.out.println(r);
        }
        catch(ArithmeticException ae){
            System.err.println(ae.getMessage());
        }
        finally{
            System.err.println("it is undefine");
        }
        
        
    }
    
    
}
