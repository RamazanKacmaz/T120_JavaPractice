package reCAP;

public class C08 {
    public static void main(String[] args) {

        int [] arr = {2,3,4,5,8,9,5,6,7,2,56,4,52,5,5,5,5,4,1,5,41,2,};
        istenensayi(arr,7);
        
    }

    private static void istenensayi(int[] arr, int istenen) {

        int flag = 0;

        for (int j = 0; j <arr.length ; j++) {
            if (istenen == arr[j]){
                flag++;
            }

            }

            if (flag != 0 ){
                System.out.println(istenen + " " + flag) ;
            }else {
                System.out.println("nasasodada");
            }


    }
}
