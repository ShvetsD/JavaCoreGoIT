package Module2;

public class Task2 {
    static double withdrawBalance(double balance, double withdrawal, double comission) {
        return balance - withdrawal - comission;
    }


    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        // int[] balances1 = {200, 200, 500, 4000, 30};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        int i =1;
            String ownerName = ownerNames[i];
            double balance = balances[i];

        double withdrawal = 240;
        double a = 0.05;
        double comission = withdrawal * a;
        double balanceAfter = withdrawBalance(balance, withdrawal, comission);
        if (balanceAfter >= 0) {
            System.out.println(ownerName + " " + withdrawal + " " + balanceAfter);
        }             else
            System.out.println("NO");

    }
}

