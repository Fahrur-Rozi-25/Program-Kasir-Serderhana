package Project;

import dataUser.saldoUser;

public class testSaldo {
    public static void main(String[] args) {
        saldoUser saldoUser = new saldoUser();
       saldoUser.setSaldo(20000);
        System.out.println(saldoUser.getSaldo());
    }
}
