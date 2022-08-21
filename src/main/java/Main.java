import entities.IPhones;
import services.IPhonesEntityManager;

public class Main {

    public static void main(String[] args) {
        IPhonesEntityManager one = new IPhonesEntityManager();
//        IPhones iPhone1 = new IPhones();
//        iPhone1.setName("iPhone 15");
//        iPhone1.setCost(1500);
//        iPhone1.setFingerprint("Y");
//        iPhone1.setYear_released("2023");
//        iPhone1.setSize(6.7f);
//
//        one.create(iPhone1);

//        IPhones iPhone2 = new IPhones();
//        iPhone2.setName("iPhone 16");
//        iPhone2.setCost(1600);
//        iPhone2.setFingerprint("Y");
//        iPhone2.setYear_released("2023");
//        iPhone2.setSize(6.7f);
//
//        one.update(iPhone2, 1);

        System.out.println(one.findById(1));

    }
}
