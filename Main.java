import java.util.Scanner;

public class Main {


    static Scanner scanner = new Scanner(System.in);
    public static final int HOUR_ARROW_ANGLE_PER_HOUR = 30;
    public static final int MINUTE_ARROW_ANGLE_PER_MINUTE = 6;

    public static void main(String[] args) {
        System.out.println("Enter hours (12 or 24 hrs format):");
        int hours = scanner.nextInt();
        hours = hoursConverter(hours);
        System.out.println("Enter minutes: ");
        int minutes = scanner.nextInt();
        System.out.println("The angle between arrows is " + calculator(hours, minutes) + " degrees.");

        scanner.close();
    }

    private static int hoursConverter(int hours) {
        if (hours > 12) {
            hours = hours - 12;
        }
        return hours;
    }

    public static int calculator(int hours, int minutes) {
        int hourAngle = hours * HOUR_ARROW_ANGLE_PER_HOUR;
        int minuteAngle = minutes * MINUTE_ARROW_ANGLE_PER_MINUTE;
        int angleBetweenArrows = Math.abs(hourAngle - minuteAngle);

        if (angleBetweenArrows > 180) {
            angleBetweenArrows = 360 - angleBetweenArrows;
        }
        return angleBetweenArrows;
    }
}
