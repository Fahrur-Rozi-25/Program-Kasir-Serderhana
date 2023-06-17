package Project;

import Data.Pembelian;
import dataUser.saldoUser;
import utils.MenuMakanan;

import java.util.Scanner;

public class RealProject {
    static saldoUser saldoUser = new saldoUser();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Jumlah saldo Anda Rp.");
        System.out.println(saldoUser.getSaldo());

        MenuMakanan.MenuUtama();

        System.out.println("Masukkan Pilihan Anda");
        var inputuser = scanner.nextLine();
        System.out.println("Your Input : "+inputuser);

        Pembelian.pembelian(inputuser);








    }
}
