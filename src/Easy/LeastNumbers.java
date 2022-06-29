package Easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LeastNumbers {
    class Solution{
        public int[] getLeastNUmbers(int []arr, int k){
            int vec[] = new int[k];
            Arrays.sort(arr);
            for (int i =0;i<k;i++){
                vec[i] = arr[i];
            }return vec;
        }
    }
}

