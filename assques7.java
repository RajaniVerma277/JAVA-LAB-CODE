public class assques7{
    public static void main(String args[]){
        for(int i=3;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int x=i;x<=3;x++){
                System.out.print("*");
            }
            for(int y=i;y<3;y++){
                System.out.print("*");
            }
            System.out.println();
        }
        

    }
}