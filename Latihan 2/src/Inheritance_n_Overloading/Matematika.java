package Inheritance_n_Overloading;
//Nama  : Amir Kholiliddin Ismail
//NIM   : 11200930000026
//Kelas : 2A
 class Matematika {

    int Hasil;
    double Hasil_1;

    //int 2 Paramater
    void pertambahan (int a, int b){
        Hasil = a + b;
        System.out.println("(Pemjumlahan) " + a +" + "+ b +" = " + getHSL() );
    }
    void pengurangan (int a, int b){
        Hasil = a - b;
        System.out.println("(Pengurangan) " + a +" - "+ b +" = " + getHSL() );
    }
    void perkalian (int a, int b){
        Hasil = a * b;
        System.out.println("(Perkalian) " + a +" * "+ b +" = " + getHSL() );
    }
    void pembagian (int a, int b){
        Hasil = a / b;
        System.out.println("(Pembagian) " + a +" / "+ b +" = " + getHSL() );
    }

    // int 3 parameter
    void pertambahan (int a, int b, int c){
        Hasil = a + b + c;
        System.out.println("(Pemjumlahan) " + a +" + "+ b + " + "+  c +" = " + getHSL() );
    }
    void pengurangan (int a, int b, int c){
        Hasil = a - b - c;
        System.out.println("(Pengurangan) " + a +" - "+ b + " - "+  c +" = " + getHSL() );
    }
    void perkalian (int a, int b, int c){
        Hasil = a * b * c;
        System.out.println("(Perkalian) " + a +" * "+ b +" * " + c + " = " + getHSL() );
    }
    void pembagian (int a, int b, int c){
        Hasil = a / b /c;
        System.out.println("(Pembagian) " + a +" / "+ b + " / " + c + " = " + getHSL() );
    }
    int getHSL(){

        return Hasil;
    }

    // double 2 paramater
    void pertambahan (double a, double b){
        Hasil_1 = a + b;
        System.out.println("(Pemjumlahan) " + a +" + "+ b + " = " + getHasil_1() );
    }
    void pengurangan (double a, double b){
        Hasil_1 = a - b;
        System.out.println("(Pengurangan) " + a +" - "+ b +" = " + getHasil_1() );
    }
    void perkalian (double a, double b){
        Hasil_1 = a * b;
        System.out.println("(Perkalian) " + a +" * "+ b +" = " + getHasil_1() );
    }
    void pembagian (double a, double b){
        Hasil_1 = a / b;
        System.out.println("(Pembagian) " + a +" / "+ b +" = " + getHasil_1() );
    }
    // double 3 paramater
    void pertambahan (double a, double b, double c){
        Hasil_1 = a + b + c;
        System.out.println("(Pemjumlahan) " + a + " + " + b + " + " +  c + " = " + getHasil_1() );
    }
    void pengurangan (double a, double b, double c){
        Hasil_1 = a - b - c;
        System.out.println("(Pengurangan) " + a +" - "+ b +" - "+  c + " = " + getHasil_1() );
    }
    void perkalian (double a, double b, double c){
        Hasil_1 = a * b * c;
        System.out.println("(Perkalian) " + a +" * "+ b + " * "+ c + " = " + getHasil_1() );
    }
    void pembagian (double a, double b, double c){
        Hasil_1 = a / b / c;
        System.out.println("(Pembagian) " + a +" / "+ b + " / "+ c + " = " + getHasil_1() );
    }

    double getHasil_1(){

        return Hasil_1;
    }
}