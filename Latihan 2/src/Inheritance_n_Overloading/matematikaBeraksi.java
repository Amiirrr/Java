package Inheritance_n_Overloading;

//Nama  : Amir Kholiliddin Ismail
//NIM   : 11200930000026
//Kelas : 2A

public class matematikaBeraksi {
    public static void main(String []args) {

        matematikaCanggih uji = new matematikaCanggih();

        System.out.println("=====LATIHAN OVERLOADING=====\n");

        uji.pertambahan(23,34);
        uji.pertambahan(3.4, 4.9);
        uji.pertambahan(12, 28, 14);
        uji.pertambahan(12.5, 28.7, 14.2);

        System.out.println();

        uji.pengurangan(23,34);
        uji.pengurangan(3.4, 4.9);
        uji.pengurangan(12, 28, 14);
        uji.pengurangan(12.5, 28.7, 14.2);

        System.out.println();

        uji.perkalian(23,34);
        uji.perkalian(3.4, 4.9);
        uji.perkalian(12, 28, 14);
        uji.perkalian(12.5, 28.7, 14.2);

        System.out.println();

        uji.pembagian(23,34);
        uji.pembagian(3.4, 4.9);
        uji.pembagian(12, 28, 14);
        uji.pembagian(12.5, 28.7, 14.2);

        System.out.println();

        uji.modulus(23,34);
        uji.modulus(3.4, 4.9);
        uji.modulus(12, 28, 14);
        uji.modulus(12.5, 28.7, 14.2);
    }
}