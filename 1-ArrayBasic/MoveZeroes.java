//move zeroes to the end of the array
public class MoveZeroes {

    public static void moveZeroes(int arr[]){
        int j=0;
        for(int i =0 ; i<arr.length; i++){
            if(arr[i]!=0){
                arr[j++] = arr[i];
            } 
        }
        while(j<arr.length){
            arr[j++] = 0;
        }
        printArray(arr);
    } //this approach is good but not appropriate for large arrays, 
    //because in this we are putting zeroes explicitly

    //optimized approach, using two pointer and swapping
    
    public static void moveZeroesToEnd(int arr[]){
        int i = 0;
        int j = arr.length -1;
        while(i<j){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            } else{
                i++;
            }
        }

       

        printArray(arr);
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,0,2,3,4,0,2,0,1};
        moveZeroes(arr);

        int arr2[] = {1,0,2,3,4,0,2,0,1};
       System.out.println("\noptimized approach: ");
       moveZeroesToEnd(arr2);
    }
}
