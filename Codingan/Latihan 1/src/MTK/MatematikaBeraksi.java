package MTK;

public class MatematikaBeraksi {
    public static void main(String[]args){

        Matematika getHasil = new Matematika();

        //Deklarasi
        getHasil.pertambahan(20 ,20 );
            System.out.println("Pertambahan 20 + 20 = " + getHasil.getHSL());
        getHasil.pengurangan(10, 5);
            System.out.println("Pengurangan 10 - 5 = " + getHasil.getHSL());
        getHasil.perkalian(10, 20);
            System.out.println("Perkalian 10 * 20 = " + getHasil.getHSL());
        getHasil.pembagian(21, 2);
            System.out.println("Pembagian 21/2 = " + getHasil.getHSL());

        }
    }

