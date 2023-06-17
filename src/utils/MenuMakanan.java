package utils;


import makanan.*;

public class MenuMakanan {

    public static void MenuUtama(){
        makanan nasiGoreng = new nasiGoreng();
        makanan ayamBakar = new ayamBakar();
        System.out.println(
                "\t\t--MENU MAKANAN DI SINI--\n"
                        +"\n-----1 "+nasiGoreng.NamaMakanan()+" ----- harga = "+nasiGoreng.HargaMakanan()
                        +"\n-----2 "+ayamBakar.NamaMakanan()+" ----- harga = "+ayamBakar.HargaMakanan()

        );
    }

}
