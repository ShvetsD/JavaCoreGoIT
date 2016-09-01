package Module2;


import com.sun.org.apache.xpath.internal.SourceTree;

import static Module2.Task1.secondLargest;

public class Task1 {
    public static int Sum(int[] array) {
        int sum = 0;
        for (int index : array) {
            sum += index;
        }
        return sum;

    }

    public static int Modulus(int[] array) {
        int i = array[0];
        int b = array[array.length - 1];
        int mod = b % i;
        return mod;

    }

    public static int maxElement(int[] array) {
        int max = array[0];
        for (int maximum : array) {
            if (max < maximum) {
                max = maximum;
            }
        }

        return max;
    }

    public static int minElement(int[] array) {
        int min = array[0];
        for (int index : array) {
            if (min > index) {
                min = index;
            }
        }
        return min;
    }

    public static double mult(int[] array) {
        double multip = 1;
        for (int element : array) {
            multip *= element;
        }

        return multip;
    }

    public static int maxPositive(int[] array) {
        int max = array[0];
        for (int item : array) {
            if (max < item && max > 0) {
                max = item;
            }
        }
        return max;
    }

    public static int secondLargest(int[] array) {
        int max0 = 0;
        int max1 = 0;
        for (int item : array) {
            if (max0 < item) {
                max0 = item;
            }
            if (max1 < item && item < max0) {
                max1 = item;
            }
        }

        return max1;
    }

    public static void main(String[] args) {
        int[] array = {156, 486, 4678, 546, 646, 188, 674, 133, 987, 434, -1456, -546, -78, -546};
        System.out.println(Sum(array));
        System.out.println(Modulus(array));
        System.out.println(maxElement(array));
        System.out.println(minElement(array));
        System.out.println(mult(array));
        System.out.println(maxPositive(array));
        System.out.println(secondLargest(array));
    }
}
