public class addDiagonal {
    
    public static void main(String[] args) {
            int arr[][]={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
            };
            int r=4;
            int c=5;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.err.print(arr[i][j]+" ");
                }
                System.err.println("");
            }
            int sum=0;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(i==j || (i+j)==4){
                        sum=sum+arr[i][j];

    
                }
                    
                    
                }
                
            }
            System.out.println(sum);
        }
    }
    

