import java.util.Scanner;

public class Main {


    static Scanner scanner = new Scanner(System.in);
    public static final double HOUR_ARROW_ANGLE_PER_HOUR = 30;
    public static final double HOUR_ARROW_ANGLE_PER_MINUTE = 0.5;
    public static final double MINUTE_ARROW_ANGLE_PER_MINUTE = 6;

    public static void main(String[] args) {
        System.out.println("Enter hours (12 or 24 hrs format):");
        double hours = scanner.nextInt();
        hours = hoursConverter(hours);
        System.out.println("Enter minutes: ");
        double minutes = scanner.nextInt();
        System.out.println("The angle between arrows is " + calculator(hours, minutes) + " degrees.");

        scanner.close();
    }

    private static double hoursConverter(double hours) {
        if (hours > 12) {
            hours = hours - 12;
        }
        return hours;
    }

    public static double calculator(double hours, double minutes) {
        double hourAngle = hours * HOUR_ARROW_ANGLE_PER_HOUR;
        hourAngle += minutes * HOUR_ARROW_ANGLE_PER_MINUTE;
        double minuteAngle = minutes * MINUTE_ARROW_ANGLE_PER_MINUTE;

        double angleBetweenArrows = Math.abs(hourAngle - minuteAngle);

        if (angleBetweenArrows > 180) {
            angleBetweenArrows = 360 - angleBetweenArrows;
        }
        return angleBetweenArrows;
    }
}
