public class Chapter8_Program4_extra {
    public static double calcToll(int hour, boolean isMorning, boolean isWeekend) {
        double tollFee = 0.0;
        if (hour < 7 && isMorning) {
            if (isWeekend) {
                tollFee = 6.05;
            } else {
                tollFee = 6.15;
            }
        } else if (hour < 10 && isMorning) {
            if (isWeekend) {
                tollFee = 7.15;
            } else  {
                tollFee = 7.95;
            }
        } else if (hour < 12 && isMorning) {
            if (isWeekend) {
                tollFee = 7.15;
            } else {
                tollFee = 6.90;
            }
        } else if (hour < 3 && !isMorning) {
            if (isWeekend) {
                tollFee = 7.15;
            } else {
                tollFee = 6.90;
            }
        } else if (hour < 8 && !isMorning) {
            if (isWeekend) {
                tollFee = 7.15;
            } else {
                tollFee = 8.95;
            }
        } else {
            if (isWeekend) {
                tollFee = 6.10;
            } else {
                tollFee = 6.40;
            }
        }

        return tollFee;
    }

    public static void main(String[] args) {
        System.out.println(calcToll(8, true, false));
        System.out.println(calcToll(1, false, false));
        System.out.println(calcToll(3, false, true));
        System.out.println(calcToll(5, true, true));
    }
}
