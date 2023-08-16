package reCAP;

import java.util.ArrayList;
import java.util.List;

public class C10 {
    public static void main(String[] args) {

        int [] arr = {2,3,4,5,8,9,5,6,7,2,56,4,52,5,5,5,5,4,1,5,41,2,};
        System.out.println("Tekrarsiz array : " + tekrarlarisil(arr));
    }

    private static List<Integer> tekrarlarisil(int[] arr) {

        List<Integer> duzenliarr = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (!(duzenliarr.contains(arr[i]))){
                duzenliarr.add(arr[i]);
            }
        }


        return duzenliarr;
    }
}
