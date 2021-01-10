import java.util.HashSet;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
       // Lets implement Hash Table

        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "Faisal");
        ht.put(2, "Goku") ;
        ht.put(3, "Rahul") ;

        System.out.println(ht);

        int[] arr1 = {11,5,6,3,7,1} ;
        int[] arr2 = {3, 5, 110};
        boolean res = subArray(arr1, arr2) ;
        System.out.println(res);
    }

    public static boolean subArray(int arr1[], int arr2[]){
        int m = arr1.length;
        int n = arr2.length;

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < m; i++){
            if (!hashSet.contains(arr1[i])){
                hashSet.add(arr1[i]) ;
            }
        }
        for (int i = 0; i < n; i++){
            if (!hashSet.contains(arr2[i])){
                return false;
            }
        }
        return  true ;
    }
}
