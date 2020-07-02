import java.util.Scanner;


public class Problem3 {

    public static void main(String[] args) {

        double x1, y1, x2, y2, r1, r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter circle1's center x-, y-coordination, and radius: ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        r1 = sc.nextDouble();

        System.out.println("Enter circle2's center x-, y-coordination, and radius: ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        r2 = sc.nextDouble();

        double distance = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        if (distance <= Math.abs(r1 - r2)) {
            System.out.println("circle 2 is inside circle 1");
        }
        else if (distance <= (r1 +r2)){
            System.out.println("circle 2 overlaps circle 1");
        }
    }
}
