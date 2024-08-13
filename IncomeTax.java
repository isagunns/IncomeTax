import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double income, tax;

        System.out.println("Enter net income:\n" + "Do not include dollar sign or any commas. ");
        income = keyboard.nextDouble();

        if (income < 17000)
            tax = 0;

        else if (income < 35000)
            tax = 0.05 * (income - 17000);

        else
            tax = 0.05 * (17000) + 0.10 * (income - 35000);

        System.out.printf("Tax due: $%.2f ", tax);
        keyboard.close();
    }
}
