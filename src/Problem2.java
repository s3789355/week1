import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        while (true){
        System.out.println("input you number:" );
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            if (num%5 == 0 && num%6 ==0){
                System.out.println(num + " is divisible by both 5 and 6");

            }
            else if ((num%5 != 0 && num%6 ==0) || (num%5 == 0 && num%6 != 0)){
                System.out.println(num + " is divisible by 5 or 6, but not both");

            }
            else {
                System.out.println(num + " is not divisible by either 5 or 6");
            }
        }
    }
}
