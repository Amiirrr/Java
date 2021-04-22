//NAMA : AMIR KHOLILUDDIN ISMAIL
//NIM : 11200930000026
//KELAS : 2A SISTEM INFORMASI

// Nomor 4

// Class yang memanggil
package callPackage;
import testPackage.*;
public class panggilClassInPackage {

    public static void  main(String []args  ) {

        package1 callTest = new package1();

        callTest.test();
    }
}

