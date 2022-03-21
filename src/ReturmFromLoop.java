public class RetrunFromLoop {
    public static void main(String[] args) {
        retrunLoop();
    }

    static void retrunLoop() {
        int x;
        System.out.println("example of retrun in for-loop");
        for (x = 1; x <= 10; x++) {
            if (x < 5) {
                System.out.printf("%d", (x - 1));
            } else {
                System.out.println("\n");
                return;
            }
            System.out.println("tidak akan pernah dieksekusi");
        }
    }
}