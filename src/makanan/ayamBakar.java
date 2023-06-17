package makanan;

public class ayamBakar implements makanan{
    @Override
    public String NamaMakanan() {
        return "Ayam Bakar";
    }

    @Override
    public int HargaMakanan() {
        return 19_000;
    }
}
