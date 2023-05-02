package Assign5;
//Input: nums = [-1,-2,-3,-4,3,2,1]
//Output: 1
//Explanation: The product of all values in the array is 144, and signFunc(144) = 1
public class Test32 {
    public static void main(String[] args) {
      int[] arr={-1,-2,-3,-4,3,2,1};
      
        System.out.println(posneg(arr));
    }

    static int posneg(int[] arr){
        int pro=1;
        for (int i = 0; i < arr.length; i++) {
            pro=pro*arr[i];
        }
        if(pro>0){
            return 1;
        } else if (pro<0) {
            return -1;

        }
        else
            return 0;


    }
}
