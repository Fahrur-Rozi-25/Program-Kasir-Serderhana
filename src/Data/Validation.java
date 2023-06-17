package Data;


import dataUser.saldoUser;

import java.util.Scanner;

public class Validation {

    static saldoUser saldoUser = new saldoUser();
    static Scanner scanner = new Scanner(System.in);
    public static int validate(String namaMakanan , int hargaMakanan) {

        System.out.println("saldo anda sebesar Rp."+saldoUser.getSaldo());
        if (saldoUser.getSaldo() <= hargaMakanan) {
            System.out.println("Saldo Anda Kurang Silahkan Topup saldo terlebih dahulu");
        int saldoSekarang = TopUpSaldo.isiSaldo();

            if (saldoSekarang >= hargaMakanan) {
                System.out.println("Tadi anda ingin membeli : "+namaMakanan);
                System.out.println("Ketik 'yakin' jika ingin melanjutkan beli");
                System.out.println("Ketik 'batal' jika ingin membatalkan");

                String Pilihan = scanner.nextLine();
                switch (Pilihan) {
                    case "yakin":
                        System.out.println("sukses membeli : " +namaMakanan);
                        Object uuid = IDGenerator.UUIDGenerator();
                        System.out.println("Kode Pembelian : "+uuid);
                        int totalSaldo = saldoSekarang - hargaMakanan;
                        System.out.println("sisa saldo Anda = "+totalSaldo);
                        return 1;
                    case "batal":
                        System.out.println("Pembelian Di Batalkan Oleh Anda");
                        return 2;
                }
            } else if (saldoSekarang <= hargaMakanan) {
                System.out.println("Saldo Anda Kurang Silahkan Topup saldo terlebih dahulu");
                TopUpSaldo.isiSaldo();
            }
        } else {
            System.out.println("Ketik 'yakin' jika ingin melanjutkan");
            System.out.println("Ketik 'batal' jika ingin membatalkan");

            String Pilihan = scanner.nextLine();
            switch (Pilihan) {
                case "yakin":
                    System.out.println("sukses membeli : " +namaMakanan);
                    int totalSaldo = saldoUser.getSaldo() - hargaMakanan;
                    System.out.println("sisa saldo Anda = "+totalSaldo);
                    return 1;
                case "batal":
                    System.out.println("Pembelian Di Batalkan Oleh Anda");
                    return 2;

            }
        }
        return 0;

    }
}
