package upb.edu.co.testjunitproject;

public class Main {

    public static void main(String[] args) {
        double salary1 = 1000.50;
        double salary2 = 5500.15;
        double expense = -2000;
        System.out.println("->First Salary Example: " + MoneyUtil.format(salary1));
        System.out.println("->Second Salary Example: " + MoneyUtil.format(salary2, "£"));
        System.out.println("->Example of Expense: " + MoneyUtil.format(expense));
    } // main
} // public class Main
