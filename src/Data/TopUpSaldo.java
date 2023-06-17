package Data;

import Project.RealProject;
import dataUser.saldoUser;

import java.util.Scanner;

public class TopUpSaldo {
    static Scanner scanner = new Scanner(System.in);
    static saldoUser saldoUser = new saldoUser();
    public static int isiSaldo() {
        System.out.println("ketik 'topup' jika ingin mengisi saldo anda");
        System.out.println("ketik 'batal' jika ingin membatalkan pembelian anda");
        String inputUser = scanner.nextLine();

        switch (inputUser) {
            case "topup" :
                System.out.print("Masukkan Jumlah nominal yang ingin di isi Rp.");
                int topup = scanner.nextInt();
                System.out.println("Berhasil Topup senilai + Rp."+topup);
                saldoUser.setSaldo(topup);
                System.out.println("Saldo Anda Saat Ini Yaitu Rp."+saldoUser.getSaldo());
                return topup;
            case "batal" :
                System.out.println("Anda membatalkan pembelian");
                System.exit(1);
                break;
            default :
                System.out.println("error");
        }
        return 0;
    }


}
