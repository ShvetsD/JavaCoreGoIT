package Module2;


import com.sun.org.apache.xpath.internal.SourceTree;

public class Task1 {
   static int Sum(int[] array) {
        int sum = 0;
        for (int index : array) {
            sum += index;
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] array = {156, 486, 4678, 546, 646, 188, 674, 133, 987, 434};
        System.out.println(Sum(array));
    }
}
