package Inheritance_n_Overloading;

//Nama  : Amir Kholiliddin Ismail
//NIM   : 11200930000026
//Kelas : 2A

public class matematikaCanggih extends Matematika   {

    void modulus(int a, int b){
        Hasil = a % b;
        System.out.println("(Modulus) " + a +" % "+ b +" = " + getHSL() );
    }

    void modulus(int a, int b, int c){
        Hasil = a % b % c;
        System.out.println("(Modulus) " + a +" % "+ b + " % "+ c +" = " + getHasil_1() );
    }

    void modulus(double a, double b){
        Hasil_1 = a % b;
        System.out.println("(Modulus) " + a +" % "+ b +" = " + getHSL() );
    }

    void modulus(double a, double b, double c){
        Hasil_1 = a % b % c;
        System.out.println("(Modulus) " + a +" % "+ b + " % "+ c + " = " + getHasil_1() );
    }

}