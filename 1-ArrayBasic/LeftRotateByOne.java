public class LeftRotateByOne {
    public static void leftRotate(int arr[]){
        if(arr.length == 0|| arr.length==1){
            return;
        }
        int temp = arr[0];
        for(int i = 1; i<arr.length; i++){
            arr[i-1] = arr[i];
        } 
        arr[arr.length-1] = temp;
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,4,6,1,7};
        leftRotate(arr);
        printArray(arr);
    }    
}
