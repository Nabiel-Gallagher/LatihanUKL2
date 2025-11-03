import java.util.Scanner;

public class MudahSoal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("PROGRAM CEK BILANGAN GANJIL / GENAP");
        System.out.println("====================================");
        System.out.println("Masukkan Angka: ");
        int angka = input.nextInt();
        System.out.println("-----------------------------------");

        if(angka % 2 == 0){
            System.out.println(angka + " adalah bilangan genap");
        } else {
            System.out.println(angka + " adalah bilangan ganjil");
        }

        System.out.println("===================================");
    }
}
