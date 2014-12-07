import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Pierre on 06/12/2014.
 */
public class Comparator {

    public static void main(String[] args) {
        Comparator c = new Comparator();
        c.run();
    }

    public void run() {
        System.out.println(getMax(5, 7));
        System.out.println(getMax(6.2,5.75));
        System.out.println(getMax("34","42"));
    }

    public int getMax(int n, int m) {
        return((int) getMax((double)n,(double)m));
    }
    public double getMax(double d1, double d2) {
        if (d1 > d2) {
            return d1;
        } else {
            return d2;
        }
    }

    public String getMax(String number1, String number2) {
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        return(Integer.toString(getMax((int) n1, (int) n2)));
    }

}
