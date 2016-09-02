package Module2;

public class Task2 {
    static double withdrawBalance(double balance, double withdrawal, double comission) {


        return balance - withdrawal - comission;
    }

    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        int[] balances1 = {200, 200, 500, 4000, 30};
        double balance = 1500;
        double withdrawal = 1450;
        double a = 0.05;
        double comission = withdrawal * a;
        double balanceAfter = withdrawBalance(balance, withdrawal, comission);
        if (balanceAfter >= 0) {
            System.out.println("OK " + comission + " " + balanceAfter);
        } else {
            System.out.println("NO");
        }
    }
}
