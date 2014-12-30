import Source.OldPhone;
import Source.MobilePhone;
import Source.SmartPhone;
import Source.Phone;

/**
 * Created by Pierre on 30/12/2014.
 */
public class PhoneLauncher {
    public static void main(String[] args) {
        PhoneLauncher pl = new PhoneLauncher();
        pl.run();
    }

    public void run() {
        MobilePhone myPhone = new SmartPhone("iPhone5");
        System.out.println("My phone brand: " + myPhone.getBrand());

        myPhone.call("00 33 6 12345678");
        myPhone.playGame("iFarm");

        // Downcasting for methods that require SmartPhone type
        SmartPhone samePhone = (SmartPhone) myPhone;
        samePhone.browseWeb("www.bbc.co.uk");
        System.out.println(samePhone.findPosition());
        testPhone(myPhone);

        MobilePhone myOldPhone = new MobilePhone("iPhone3");
        testPhone(myOldPhone);
    }

    public void testPhone(Phone phone) {
        SmartPhone thePhone = (SmartPhone) phone;
        thePhone.call("999");

        // SmartPhone methods
        System.out.println("My phone brand: " + thePhone.getBrand());
        thePhone.browseWeb("www.bbc.co.uk");
        thePhone.call("00 33 6 12345678");
        System.out.println(thePhone.findPosition());
        thePhone.playGame("iFarm");
        thePhone.ringAlarm("DringDring");

    }
}
