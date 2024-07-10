public class Chapter8_Program4 {
    public static double calcToll(int hour, boolean isMorning, boolean isWeekend) {
        double tollFee;

        if (isWeekend) {
            if (hour < 7) {
                tollFee = 6.05;
            } else if (hour < 20) {
                tollFee = 7.15;
            } else {
                tollFee = 6.10;
            }
        } else { // Weekday
            if (isMorning) {
                if (hour < 7) {
                    tollFee = 6.15;
                } else if (hour < 10) {
                    tollFee = 7.95;
                } else if (hour < 15) {
                    tollFee = 6.90;
                } else {
                    tollFee = 8.95;
                }
            } else {
                if (hour < 7) {
                    tollFee = 6.15;
                } else if (hour < 15) {
                    tollFee = 6.90;
                } else if (hour < 20) {
                    tollFee = 8.95;
                } else {
                    tollFee = 6.40;
                }
            }
        }

        return tollFee;
    }

    public static void main(String[] args) {
        System.out.println(calcToll(8, true, false));
        System.out.println(calcToll(1, false, false));
        System.out.println(calcToll(3, false, true));
        System.out.println(calcToll(5, true, true));
        System.out.println(calcToll(11, false, false)); // Should return 6.40
        System.out.println(calcToll(10, false, true)); // Should return 6.10
    }
}
