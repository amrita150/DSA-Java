import java.util.HashMap;

public class HashmapBasic{
    public static void main(String args[]){
        //create Hashmap
        HashMap<String, Integer> myHm = new HashMap<>();

        //operations on Hashmap
        myHm.put("Tea",20);
        myHm.put("Coffee",40);
        myHm.put("Burger",50);
        myHm.put("Pizza", 150);

        System.out.println("Price of Coffee is: "+ myHm.get("Coffee"));

        //print all elements of HashMap
        System.out.println(myHm);

        //return boolean value if contains key or not
        System.out.println(myHm.containsKey("Teaa"));

        //using iteration
        for(String st : myHm.keySet()){
            System.out.println("Keys: "+ st + " , " + "values: " + myHm.get(st));
        }
    }
}