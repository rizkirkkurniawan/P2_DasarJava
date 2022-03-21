public class PercabanganIF {
    public static void main(String[] args) {
        //if
        if (15 > 5) {
            System.out.println("true");
        }
        System.out.println("the program continues here...");
        //if -else
        int a=5;
        int b=2;
        int max;
        if ( a>b) {
            max=a;
        }else {
            max=b;

        }
        System.out.println("maximum of a or b is"+max);
        //if=else if
        int myVar=0;//the variabel is initianlized with a value of 0
        if (myVar==0) {//if the value is 0,we change its value to 1
            myVar = 1;
        }else if (myVar==1) {//if the value is 1,we change its value to 0
            myVar = 0;
        }else myVar = -1;
        }
    }