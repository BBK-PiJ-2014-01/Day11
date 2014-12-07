/**
 * Created by Pierre on 27/11/2014.
 */
public class MobilePhone extends OldPhone  {

    private String lastNumbers[]= new String[10];

    public MobilePhone(String brand) {
        super(brand);
        for (int i=0; i<10 ; i++)
            lastNumbers[i] = "";
    }

    @Override
    public void call(String number) {
        super.call(number);
        for (int i=8; i>=0 ; i--)
            lastNumbers[i+1] = lastNumbers[i];
        lastNumbers[0] = number;
    }

    public void ringAlarm(String alarm) {
        System.out.println("Alarm: " + alarm);
    }

    public void playGame(String game) {
        System.out.println("Game launched: " + game);
    }

    public void printLastNumbers() {
        System.out.println("Last 10 numbers in memory:");
        for (int i=0; i<10 ; i++)
            if (!lastNumbers[i].equals(""))
                System.out.println(lastNumbers[i]);
    }
}
