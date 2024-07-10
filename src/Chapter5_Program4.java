import java.text.DecimalFormat;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;

public class Chapter5_Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Locale currentLocale = Locale.getDefault();

        int inputWages, taxableInterest, unemploymentComp, status, taxes;
        inputWages = scanner.nextInt();
        taxableInterest = scanner.nextInt();
        unemploymentComp = scanner.nextInt();
        status = scanner.nextInt();
        taxes = scanner.nextInt();

        String formatter = "#,###.##";
        NumberFormat numberFormat = NumberFormat.getInstance(currentLocale);
        DecimalFormat decimalFormat = new DecimalFormat(formatter);

        int AGI = inputWages + taxableInterest + unemploymentComp;
        int statusDeduction;

        if (AGI > 120000) {
            System.out.println("AGI: $" + decimalFormat.format(AGI));
            System.out.println("Error: Income too high to use this form");
        } else {
            System.out.println("AGI: $" + decimalFormat.format(AGI));
            if (status == 2) {
                System.out.println("Deduction: $24,000");
                statusDeduction = 24000;
            } else {
                System.out.println("Deduction: $12,000");
                statusDeduction = 12000;
            }
            int taxableIncome = AGI - statusDeduction;
            if (taxableIncome < 0) {
                taxableIncome = 0;
                System.out.println("Taxable income: $" + decimalFormat.format(taxableIncome));
            }

            double federalTaxRate;
            if (status == 1) {
                if (taxableIncome <= 10000) {
                    federalTaxRate = taxableIncome * 0.10;
                } else if (taxableIncome <= 40000) {
                    federalTaxRate = 1000 + (taxableIncome - 10000) * 0.12;
                } else if (taxableIncome <= 85000) {
                    federalTaxRate = 4600 + (taxableIncome - 40000) * 0.22;
                } else {
                    federalTaxRate = 14500 + (taxableIncome - 85000) * 0.24;
                }
            } else {
                if (taxableIncome <= 20000) {
                    federalTaxRate = taxableIncome * 0.10;
                } else if (taxableIncome <= 80000) {
                    federalTaxRate = 2000 + (taxableIncome - 20000) * 0.12;
                }  else {
                    federalTaxRate = 9200 + (taxableIncome - 80000) * 0.22;
                }
            }
            System.out.println("Federal tax: $" + decimalFormat.format(Math.round(federalTaxRate)));

            int totalTaxWithheld = taxes;
            double taxDueOrRefund = totalTaxWithheld - federalTaxRate;
            if (taxDueOrRefund > 0) {
                System.out.println("Tax refund: $" + decimalFormat.format(Math.round(taxDueOrRefund)));
            } else {
                System.out.println("Tax due: $" + decimalFormat.format(Math.abs(Math.round(taxDueOrRefund))));
            }
        }
    }
}
