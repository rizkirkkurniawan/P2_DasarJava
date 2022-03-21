public class BreakContinue {
    public static void main(String[] args) throws NumberFormatException {
        int x;
        System.out.println("Example of break and continue in for-loop");
        for (x=1;x<=10;x++){
            if (x==7){
                break;

            }
            if (x==3){
                continue;
            }
            System.out.printf("%d",x);
        }
        System.out.println("\n");

    }
}
