import java.util.Scanner;

public class KalkulatorEksponensial{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("simple multiplication table using loops");
        System.out.println("exponent calculator");
        System.out.println("=========");
        System.out.println("enter the base");
        int a=input.nextInt();
        System.out.println("enter the exponent");
        int n=input.nextInt();
        int result=a;
        for (int i=1;i <=n -1;i++) {
            result = result * a;
        }
        System.out.printf("result : %d\n",result);
        System.out.println("thanks you for using our exponent calculator");

        }

    }
