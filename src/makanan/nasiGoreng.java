package makanan;

public class nasiGoreng implements makanan {
    @Override
    public String NamaMakanan() {
        return "nasi goreng";
    }

    @Override
    public int HargaMakanan() {
        return 17_000;
    }
}
