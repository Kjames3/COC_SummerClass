import java.util.Scanner;

public class Chapter15_Program37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        int daysInMonth = 0;

        //Split the user Input into String and int
        String[] inputParts = userInput.split(" ");
        String month = inputParts[0];
        int day = Integer.parseInt(inputParts[1]);

        //Determine if the string is a valid month
        boolean isValidMonth = false;
        for (String m : months) {
            if (m.equalsIgnoreCase(month)) {
                isValidMonth = true;
                break;
            }
        }

        //Determine if the int is a valid day
        if (isValidMonth) {
            switch (month) {
                case "January":
                case "March":
                case "May":
                case "July":
                case "August":
                case "October":
                case "December":
                    daysInMonth = 31;
                    break;
                case "February":
                    daysInMonth = 28;
                    break;
                case "April":
                case "June":
                case "September":
                case "November":
                    daysInMonth = 30;
                    break;
            }
            if (day >= 1 && day <= daysInMonth) {
                //Print the time of year the month and day are in
                if ((month.equalsIgnoreCase("March") && day >= 20) || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May") ||
                        (month.equalsIgnoreCase("June") && day <= 20)) {
                    System.out.println("Spring");
                } else if ((month.equalsIgnoreCase("June") && day >= 21) || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") ||
                        (month.equalsIgnoreCase("September") && day <= 21)) {
                    System.out.println("Summer");
                } else if ((month.equalsIgnoreCase("September") && day >= 22) || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November") ||
                        (month.equalsIgnoreCase("December") && day <= 20)) {
                    System.out.println("Autumn");
                } else {
                    System.out.println("Winter");
                }
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }

        //Close the scanner
        scan.close();
    }
}
