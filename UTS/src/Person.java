//NAMA : AMIR KHOLILUDDIN ISMAIL
//NIM : 11200930000026
//KELAS : 2A SISTEM INFORMASI

// NOMOR 2

public class Person {
    String name;
    int age;
        void person(String name, int age){
            this.name = name;
            this.age = age;
        }
        void print(){
            System.out.println("Name = " + name);
            System.out.println("Age = " + age);
        }
    public static void main(String []args) {

            Person person1 = new Person();
            person1.person("Joe Smith",24);
            person1.print();

            Person person2 = new Person();
            person2.person("Marry sharp", 52);
            person2.print();



    }
}





