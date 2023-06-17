package Data;

import makanan.*;

public class Pembelian {



    public static void pembelian (String pembelian){

        makanan nasiGoreng = new nasiGoreng();
        makanan ayamBakar = new ayamBakar();


        if (pembelian.equals(nasiGoreng.NamaMakanan())){
            System.out.println("Anda Yakin Ingin Membeli "+nasiGoreng.NamaMakanan()+"  Seharga : "+nasiGoreng.HargaMakanan());
            Validation.validate(nasiGoreng.NamaMakanan(), nasiGoreng.HargaMakanan());
        } else if (pembelian.equals(ayamBakar.NamaMakanan())) {
            System.out.println("Anda Yakin Ingin Membeli "+ayamBakar.NamaMakanan()+"  Seharga : "+ayamBakar.HargaMakanan());
            Validation.validate(ayamBakar.NamaMakanan(), ayamBakar.HargaMakanan());
        }

    }

}
