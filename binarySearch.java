public class binarySearch{
    public static void main(String[] args) {
        int[] arr={2,3,4,5,7,8,9,10,11};
        int target=10;
        int end=arr.length-1;
        int start=0;
        int count=0;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println("target found in"+mid);
                count++;
                break;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(count==0){
            System.out.println("target not found");
        }
        
    }
    

    
}


// import java.util.Arrays;

// public class binarySearch {
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 4, 5, 7, 8, 9, 10, 11};
//         int target = 10;
//         int start = 0;
//         int end = arr.length - 1;

//         while (start <= end) {
//             int mid = (start + end) / 2; // Important correction here
//             if (arr[mid] == target) {
//                 System.out.println("Target found at index " + mid);
//                 return; // Exit after finding target
//             } else if (target > arr[mid]) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }

//         System.out.println("Target not found.");
//     }
// }
