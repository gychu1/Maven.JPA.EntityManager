import entities.IPhones;
import services.IPhonesEntityManager;

public class Main {

    public static void main(String[] args) {
        IPhonesEntityManager one = new IPhonesEntityManager();
        IPhones iPhone1 = new IPhones( );
        iPhone1.setName( "iPhone 15" );
        iPhone1.setCost( 1500 );
        iPhone1.setFingerprint( "Y" );

        one.create(iPhone1);


    }
}
