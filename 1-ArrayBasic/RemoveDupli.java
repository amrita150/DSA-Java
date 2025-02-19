//remove duplicate from a sorted array
public class RemoveDupli{
    public static int removeDupli(int arr[]){
        if (arr.length == 0  || arr.length == 1) {
            return 0;
        }
        int j = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[j-1]!=arr[i]){
                arr[j++] = arr[i];
            }
        } 
        return j;
    }

    public static void printArr(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {1,1,2,2,3,3,4,4,4,5};
        int num = removeDupli(arr);
        System.out.println("no. of unique elements: " + num + " and those elements are: ");
        printArr(arr, num);
    }
}
