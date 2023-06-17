package Data;

import utils.HargaMakanan;

public class Pembelian {
    static HargaMakanan hargaMakanan = new HargaMakanan();

    public static void pembelian (String pembelian){
        int mieGoreng = HargaMakanan.mieGoreng;
        if (pembelian.equals("mie goreng")){
            System.out.println("Anda Yakin Ingin Membeli Mie Goreng Seharga : "+mieGoreng);
            Validation.validate();
        } else if (pembelian.equals("mie ayam")) {
            System.out.println("Anda Yakin Ingin Membeli mie ayam Seharga : ");
            Validation.validate();
        } else if (pembelian.equals("ayam goreng")) {
            System.out.println("Anda Yakin Ingin Membeli mie goreng Seharga : ");
            Validation.validate();
        } else if (pembelian.equals("ayam bakar")) {
            System.out.println("Anda Yakin Ingin Membeli ayam bakar Seharga : ");
            Validation.validate();
        }

    }

}
