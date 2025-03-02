import java.util.*;

public class NextSmallerElement {
    public static int[] nextSmaller(int arr[]){
        int n = arr.length;
        int nextSma[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            } 
            if(st.isEmpty()){
                nextSma[i] = -1;
            } else{
                nextSma[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nextSma;
    }

    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
       public static void main(String[] args) {
           int arr[] = {6,8,0,1,3};
           int result[] = nextSmaller(arr);
           printArray(result);
       }
}
