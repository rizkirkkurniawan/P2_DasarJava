import java.util.Scanner;

public class PercabanganSwitch {
    public static void main(String[] args) {
        //membuat variabel scanner
        String lampu;
        Scanner scan=new Scanner(System.in);

        //Mengambil input
        System.out.println("inputkan nama warna:");
        lampu=scan.nextLine();

        switch (lampu){
            case "merah":
                System.out.println("lampu merah:berhenti!");
                break;
            case "kuning":
                    System.out.println("lampu kuning,harap hati-hati");
                    break;
            case "hijau":
                        System.out.println("lampu hijau ,silahkan jalan");
                        break;
            default:
                System.out.println("warna lampu salah");


        }

    }
}
