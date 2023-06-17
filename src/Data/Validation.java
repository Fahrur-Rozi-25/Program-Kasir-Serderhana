package Data;


import java.util.Scanner;

public class Validation {
    static Scanner scanner = new Scanner(System.in);
    public static int validate(){

        System.out.println("Ketik 'yakin' jika ingin melanjutkan");
        System.out.println("Ketik 'batal' jika ingin membatalkan");

        String Pilihan = scanner.nextLine();
        switch (Pilihan) {
            case "yakin" :
                System.out.println("sukses membeli");
                return 1;
            case "batal" :
                System.out.println("Pembelian Di Batalkan Oleh Anda");
                return 2;

        }
        System.out.println("Pembelian Error with out of range");
        return 0;

    }
}
