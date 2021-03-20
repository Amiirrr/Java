package Banking;

public class BankBeraksi {
    public static void main(String[]args){

    Bank tut = new Bank(100000);

    tut.saldo();
    tut.simpanUang(500000);
    tut.ambilUang(150000);

    }
}
