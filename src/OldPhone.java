/**
 * Created by Pierre on 27/11/2014.
 * Code complete
 */
public class OldPhone implements Phone {

    private String brand = null;

    public OldPhone (String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return(brand);
    }
    public void call(String number) {
        System.out.println("Calling " + number + "...");
    }
}
