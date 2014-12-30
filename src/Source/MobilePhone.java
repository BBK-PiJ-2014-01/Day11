package Source;

import Source.OldPhone;

/**
 * Created by Pierre on 27/11/2014.
 * Code complete
 */
public abstract class MobilePhone extends OldPhone {

    private String lastNumbers[]= new String[10];

    public MobilePhone(String brand) {
        super(brand);
        for (int i=0; i<10 ; i++)
            lastNumbers[i] = "";
    }

    @Override
    public void call(String number) {
        super.call(number);
        recordNumbers(number);
    }

    public void ringAlarm(String alarm) {
        System.out.println("Alarm: " + alarm);
    }

    public void playGame(String game) {
        System.out.println("Game launched: " + game);
    }

    public abstract void browseWeb(String webLink);

    public abstract String findPosition();

    public void recordNumbers(String number) {
        for (int i=8; i>=0 ; i--)
            lastNumbers[i+1] = lastNumbers[i];
        lastNumbers[0] = number;
    }

    public void printLastNumbers() {
        System.out.println("Last 10 numbers in memory:");
        for (int i=0; i<10 ; i++)
            if (!lastNumbers[i].equals(""))
                System.out.println(lastNumbers[i]);
    }
}
