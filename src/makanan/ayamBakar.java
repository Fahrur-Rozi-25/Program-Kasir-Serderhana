package makanan;

public class ayamBakar implements makanan{
    @Override
    public String NamaMakanan() {
        return "ayam bakar";
    }

    @Override
    public int HargaMakanan() {
        return 19_000;
    }
}
