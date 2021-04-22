package matematika;
//NAMA : AMIR KHOLILUDDIN ISMAIL
//NIM : 11200930000026
//KELAS : 2A SISTEM INFORMASI

// SOAL NOMOR 3
/*Buat class MatematikaCanggihBanget yang merupakan inherit dari
class MatematikaCanggih.
Tambahkan method pertambahanEmpat(int a, int b, int c, int d)
yang menghitung pertambahan dari a, b, c, dan d. a + b + c +d
Buat class MatematikaCanggihBangetBeraksi yang memanggil
method pertambahan, perkalian, modulus, pertambahanEmpat */
public class matematikaCanggih {

    int hasil;
    double hasilD;

    void pertambahan (int a, int b,int c){
        hasil = a + b + c;
        System.out.println("(Pemjumlahan) " + a +" + "+ b +" + "+ c +" = " + getHasil() );
    }
    void perkalian (int a, int b, int c){
        hasil = a * b * c;
        System.out.println("(Perkalian) " + a +" * "+ b +" * "+ c + " = " + getHasil() );
    }

    int getHasil() {
        return hasil;
    }

    void modulus(double a, double b){
        hasilD = a % b;
        System.out.println("(Modulus) " + a +" % "+ b +" = " + getHasilD() );
    }
    double getHasilD() {
        return hasilD;
    }
}
