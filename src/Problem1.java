import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        int num1, num2, num3, max = 0;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if ((num1 > num2 && num1 > num3))
        {
            if(num2 > num3)
            {
                System.out.print(num3 + " " + num2 + " " + num1);
            }
            else
                System.out.print(num2 + " " + num3 + " " + num1);
        }
        else if ((num2 > num1 && num2 > num3))
        {
            if(num1 > num3)
            {
                System.out.print(num3 + " " + num1 + " " + num1);
            }
            else
            {
                System.out.print(num1 + " " + num3 + " " + num2);
            }
        }
        else if ((num3 > num1 && num3 > num2))
        {
            if(num1 > num2)
            {
                System.out.print(num2 + " " + num1 + " " + num3);
            }
            else
                {
                System.out.print(num1 + " " + num2 + " " + num3);
        }
        }
    }
}
