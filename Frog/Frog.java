import java.util.Scanner;

public class Frog {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1 Enter Meters");
        System.out.println("2 Enter Duration");
        System.out.println();

        int num = 0;

        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Invalid Value");
        }

        if (num == 1) {
            System.out.println("Enter the meters");

            getMeters(scanner.nextInt());
        } else if (num == 2) {
            System.out.println("Enter the duration");

            getDuration(scanner.nextInt());
        }
    }

    private static void getMeters(int meters) {
        int mod = meters % (5 + 3 + 1);

        int seconds = 0;
        int nextMeter = 5;

        while (mod > 0) {
            switch (nextMeter) {
                case 5:
                    seconds += 1;
                    mod = mod - 5;
                    nextMeter = 3;
                    break;
                case 3:
                    seconds += 2;
                    mod = mod - 3;
                    nextMeter = 1;
                    break;
                case 1:
                    seconds += 5;
                    mod = mod - 1;
                    nextMeter = 5;
                    break;
                default:
                    break;
            }
        }

        int totalDuration = (meters / (5 + 3 + 1)) * (1 + 2 + 5);

        System.out.println("Duration : " + (totalDuration + seconds));
    }

    private static void getDuration(int duration) {
        int mod = duration % (1 + 2 + 5);

        int meters = 0;
        int nextWait = 1;

        while (mod > 0) {
            switch (nextWait) {
                case 1:
                    meters += 5;
                    mod -= 1;
                    nextWait = 2;
                    break;
                case 2:
                    meters += 3;
                    mod -= 2;
                    nextWait = 5;
                    break;
                case 5:
                    meters++;
                    mod -= 5;
                    nextWait = 1;
                    break;
                default:
                    break;
            }
        }
		
        int totalMeters = (duration / (1 + 2 + 5)) * (5 + 3 + 1);

        System.out.println("Meters : " + (totalMeters + meters));
    }
}
