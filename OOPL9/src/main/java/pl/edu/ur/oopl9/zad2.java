
package pl.edu.ur.oopl9;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;
class Zadanko2 {

    public static void main(String[] args) {
       Random losujLiczby = new Random();
        TreeSet<Integer> tablica = new TreeSet<>();        
       for (int i = 0; i < 100; i++) {
                 tablica.add(losujLiczby.nextInt(101));
        
       }
       Iterator Wys = tablica.iterator();
       while (tablica.hasNext()) {
            System.out.println;
        }
    }
}

