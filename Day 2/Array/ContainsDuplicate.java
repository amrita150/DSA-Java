import java.util.HashSet;

public class ContainsDuplicate {
    //brute force approach
    public static boolean containDupli(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    } //time complexity O(n^2)

    //better approach
    //sort the array and traverse by checking arr[i]==arr[i+1]
    //time complexity of this approach will be O(nlogn)

    //optimistic approach 
    //using hashSet
    public static boolean containDuplicate(int arr[]){
        HashSet<Integer> res = new HashSet<>();
        for(int num : arr){
            if(res.contains(num)){
                return true;
            }
            res.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,8,1};
        System.out.println(containDupli(arr));
        System.out.println("Contain duplicate? " + containDuplicate(arr));
    }
}
