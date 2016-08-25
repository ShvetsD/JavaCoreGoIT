package Module2;


public class Task1 {

    public static void main(String[] args) {
        int[] array = {156, 486, 4678, 546, 646, 188, 674, 133, 987, 434};
        int sum = 0;
        for (int index : array) {
            sum += index;
        }
        System.out.println(sum);
    }

}
