
package school.management.system;

public class School {

  private static int totalMoneyEarned = 0;

    public static void updateTotalMoneyEarned(int amount) {
        totalMoneyEarned += amount;
    }

    public static int getTotalMoneyEarnedStatic() {
        return totalMoneyEarned;
    }
}