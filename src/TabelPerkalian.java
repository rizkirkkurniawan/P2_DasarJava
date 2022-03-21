public class TabelPerkalian {
    public static void main(String[] args) {
        System.out.println("simole multiplication table using loops");
    int i,j;
    for (i=1;i<=10;i++) {
        System.out.printf("%d", i);
    }
        System.out.println();
    for (i=1;i<=10;i++) {
        System.out.printf("%d",(i*2));
    }
        System.out.println();
    for (i=1;i<=10;i++){
        System.out.printf("%d",(i*3));
    }
        System.out.println();
    for (i=1;i<=10;i++){
        System.out.printf("%d",(i*4));
    }
        System.out.println();
    for (i=1;i<=10;i++){
        System.out.printf("%d",(i*5));
    }
        System.out.println();
        for (i=1;i<=10;i++){
            System.out.printf("%d",(i*6));
    }
        System.out.println();
        for (i=1;i<=10;i++) {
            System.out.printf("%d", (i * 7));
        }
        System.out.println();
        for (i=1;i<=10;i++) {
            System.out.printf("%d", (i * 8));
        }
        System.out.println();
        for (i=1;i<=10;i++) {
            System.out.printf("%d", (i * 9));
        }
        System.out.println();
        for (i=1;i<=10;i++) {
            System.out.printf("%d", (i * 10));
        }
        System.out.println("\n\nhere's a simple multipcation table using nested loops");
        for (i=1;i<=10;i++) {
            for (j = 1; j <= 10; j++) {
                System.out.printf("%d", (i * j));
            }
            System.out.println();
        }
            }
        }