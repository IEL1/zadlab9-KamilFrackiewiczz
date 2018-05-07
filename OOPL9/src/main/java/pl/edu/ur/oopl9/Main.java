
package pl.edu.ur.oopl9;

import java.util.Arrays;
import java.util.Random;
class LosowanieSortowanie {

    public static void main(String[] args) {
        Random losujLiczby = new Random();
        int[] tablica;
        tablica = new int[100];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i]=losujLiczby.nextInt(101);
        }
        System.out.println(Arrays.binarySearch(tablica,5));
        Arrays.sort(tablica);
        System.out.println(Arrays.binarySearch(tablica,5));
        
    }
}