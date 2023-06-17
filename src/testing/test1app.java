package testing;

import javax.management.ObjectName;
import java.util.Random;

public class test1app {
    public static void main(String[] args) {

        if (testing2.testing1("Rozi").equals("Rozi")) {
            System.out.println("SUKSES");
        } else if (testing2.testing1("KOK").equals("Fahrur")) {
            System.out.println("Gagal");
        }



    }
}
