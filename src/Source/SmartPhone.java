package Source;

/**
 * Created by Pierre on 27/11/2014.
 * Code complete
 */
public class SmartPhone extends MobilePhone {

    public SmartPhone (String brand) {
        super(brand);
    }

    @Override
    public void call(String number) {
        if (number.substring(0, 2).equals("00")) {
            System.out.println("Calling " + number + " through the internet to save money");
            recordNumbers(number);
        } else
            super.call(number);
    }

    public void browseWeb(String webLink) {
        System.out.println("Browsing the website: " + webLink);
    }

    public String findPosition() {
        return("GPS Position: 111-222-333");
    }

    // Exercise 4.1: Added code if playGame was set as 'private' in MobilePhone Class

    public void playGame(String game) {
        System.out.println("Game launched: " + game);
    }

}
