package sample;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class ArrayTest {
    public static void findSmallestDigit() {

    }

    public static void findLargestDigit() {

    }

    public static void findArraySum() {

    }

    public static void findArrayMultiply() {

    }




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> myArr = new ArrayList<>();


        System.out.println("Enter your 1st number: ");
        int numOne = input.nextInt();
        myArr.add(numOne);

        System.out.println("Enter your 2nd number: ");
        int numTwo = input.nextInt();
        myArr.add(numTwo);

        System.out.println("Enter your 3rd number: ");
        int numThree = input.nextInt();
        myArr.add(numThree);

        System.out.println("Enter your 4th number: ");
        int numFour = input.nextInt();
        myArr.add(numFour);

        System.out.println("Enter your 5th number: ");
        int numFive = input.nextInt();
        myArr.add(numFive);

        System.out.println(myArr);

//      1.) Find the sum of the elements in the arraylist
        int sum  = 0;
        for (int i=0; i<myArr.size(); i++) {
            sum += myArr.get(i);
        }
        System.out.println(sum);

//      2.) find the multiplicand of the items in the arraylist
        int mult  = 1;
        for (Integer integer : myArr) {
            mult *= integer;
        }
        System.out.println(mult);

//      3.) Find the largest digit
//        This method works as well: int large = Collections.max(myArr);
        int large  = 0;
        for (Integer integer : myArr) {
            if (integer > large) {
                large = integer;
            }
        }
        System.out.println(large);

//      4.) Find the smallest digit
//       This method works as well: int small = Collections.min(myArr);
        int small = myArr.get(0);
        for (int i=0; i<myArr.size(); i++) {
            if (i == 0) {
                small = myArr.get(0);
            } else {
                if (myArr.get(i) < small) {
                    small = myArr.get(i);
                }
            }

        }
        System.out.println(small);



    }
}
