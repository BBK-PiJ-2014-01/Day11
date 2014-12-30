import Source.MobilePhone;
import Source.SmartPhone;

/**
 * Created by Pierre on 30/12/2014.
 */
public class PhoneLauncher {
    public static void main(String[] args) {
        PhoneLauncher pl = new PhoneLauncher();
        pl.run();
    }

    void run() {
        SmartPhone myPhone = new SmartPhone("iPhone");
        System.out.println("My phone brand: " + myPhone.getBrand());
        myPhone.browseWeb("www.bbc.co.uk");
        myPhone.call("00 33 6 12345678");
        myPhone.findPosition();
        myPhone.playGame("iFarm");
    }
}
