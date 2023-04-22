import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr=new int[5];// here we are basically Declaring an array of 1 dimension.

        //We are using Scanner class for taking an input from the user.. so basically we are creating an object of it.
        Scanner sc=new Scanner(System.in); // sc is basically the name of the object

        // steps for initializing an Array.
        for (int i = 0; i <arr.length ; i++) // .length is basically an already predefined method used to get the length of the array.
        {
             arr[i]=sc.nextInt();
        }

        //Steps for displaying an array.
        System.out.print("The elements present in the array are: ");
        for (int i = 0; i <arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}