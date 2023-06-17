package utils;

import dataUser.saldoUser;

public class ChooseFood {
    static saldoUser saldo = new saldoUser();

    public static String mieGoreng (int bayar){
        int saldo1 = saldo.getSaldo();
        int mieGoreng = HargaMakanan.mieGoreng;
        if (bayar == mieGoreng){
            return "pas";
        }
        return "Kurang";
    }
    public static void saldo(){
        saldo.getSaldo();
        System.out.println(saldo.getSaldo());
    }




}
