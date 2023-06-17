package Project;

import dataUser.saldoUser;
import utils.ChooseFood;
import utils.HargaMakanan;
import utils.Scanners;

public class MiniProject {
    public static void main(String[] args) {
        System.out.println("Saldo Anda");
        saldoUser saldoUser = new saldoUser();
        int saldo = saldoUser.getSaldo();
        System.out.println(saldo);

        int hargaMieGoreng = HargaMakanan.mieGoreng = 10_000;


        System.out.println(
                "\t\tHAloo Gais\n"
                +"\n-----1 mie goreng ----- harga = "+hargaMieGoreng
                +"\n-----2 mie goreng -----"
                +"\n-----3 mie goreng -----"
                +"\n-----4 mie goreng -----"
                
        );
        System.out.print("Masukkan Nilai Rp anda Rp.");
        int bayar = Scanners.NextInt();
        if (bayar > saldo){
            System.out.println("Saldo anda tidak cukup");
            System.exit(1);
        }
        System.out.println(ChooseFood.mieGoreng(bayar));



    }
}
