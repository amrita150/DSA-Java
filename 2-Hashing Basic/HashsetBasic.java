import java.util.HashSet;
import java.util.Iterator;

public class HashsetBasic {
    public static void main(String[] args) {
        HashSet<String> myHs = new HashSet<>();

        //operations on hashset
        myHs.add("Python");
        myHs.add("C++");
        myHs.add("Java");
        myHs.add("Kotlin");

        System.out.println(myHs.contains("JavaScript"));
        System.out.println(myHs);

        //iteration
        for(String st: myHs){
            System.out.println(st);
        }

        //we can also do iteration using iterator
        Iterator<String> it = myHs.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        //to remove all items use clear
        myHs.clear();

        System.out.print(myHs.isEmpty());
    }
  
}
