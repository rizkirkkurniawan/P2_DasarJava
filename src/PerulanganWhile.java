public class PerulanganWhile {
    public static void main(String[] args) {
        //while loop
        int x=0;
        System.out.println("example of while loop--");
        while (x<=10){
            System.out.printf("%d",x);
            x++;

        }
        System.out.println("\n");
        //do-while loop
        int y=0;
        do {
            y=y+10;
            System.out.println("i am inside do blok---"+y);
        }
        while (y<=50);
    }
}