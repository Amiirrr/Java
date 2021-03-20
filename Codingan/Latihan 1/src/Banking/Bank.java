package Banking;
//Nama  : Amir Kholiliddin Ismail
//NIM   : 11200930000026
public class Bank {
    int saldo;

    public Bank (int saldo){
        this.saldo = 100000; // saldo variable
    }

    void saldo (){
        System.out.println("Selamat datang di BANK tut");
        System.out.println("Saldo saat ini = " + saldo);
        System.out.println("   |   ");

    }

    void simpanUang(int simpanUang){
        saldo = saldo + simpanUang;
        System.out.println("Simpan Uang : " + simpanUang);
        System.out.println("Saldo saat ini : " + saldo);
        System.out.println("   |   ");
    }

    void ambilUang(int ambilUang){
        saldo = saldo - ambilUang;
        System.out.println("Ambil Uang : " + ambilUang);
        System.out.println("Saldo saat ini : " + saldo);

    }

    int getSaldo(){
        return saldo;
    }

}
