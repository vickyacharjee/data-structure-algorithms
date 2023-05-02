package Assign5;

public class Test34 {

        public static void main(String[] args) {
            int[] arr={-1,-2,-3,-4,-3,-2,-1};

            System.out.println(posneg(arr));
        }

        static int posneg(int[] arr){
            int sign = 1;

            for (final int num : arr) {
                if (num == 0)
                    return 0;
                if (num < 0)
                    //Idar lagya bhai
                    sign = -sign;
            }

            return sign;


        }
    }


