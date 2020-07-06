import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static int [] arrayAfterFour(int [] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                k = i;
            }
        }

//        if (k != 4) {
//            try {
//                throw new RuntimeException("В массиве нет 4!!!");
//            } catch (RuntimeException e) {
//                e.printStackTrace();
//            }
//
//        }
        int[] newArr = new int[arr.length - 1 - k];
        System.arraycopy(arr, k + 1, newArr, 0, arr.length - 1 - k);
        return newArr;
    }

    public  static boolean onrAndFour(int [] arr){
        int a=0;
        int b=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==4 ){
               a++;

            } else if(arr[i]==1){
                b++;
            } else{
                return false;
            }

        }
        if(a==0 || b==0){
            return false;
        }
      return true;

    }

}
