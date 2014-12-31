/**
 * Created by Pierre on 30/12/2014.
 */
public class GenericMap<T> implements SimpleMap {

    private String[] map;
    int counter;

    public SimpleMapImpl(int size) {
        counter = 0;
        map = new String[size];
        for (int i=0;i<map.length;i++)
            map[i]="";
    }

    /**
     * Puts a new String in the map.
     *
     * If the key is already in the map, nothing is done.
     */
    @Override
    public void put(int key, String name) {
        if (map[key].equals("")) {
            map[key] = name;
            counter++;
        } else
            System.out.println("Sorry key already taken!");
    }

    /**
     * Returns the name associated with that key,
     * or null if there is none.
     */
    @Override
    public String get(int key) {
        if (map[key].equals(""))
            return null;
        else
            return(map[key]);
    }

    /**
     * Removes a name from the map. Future calls to get(key)
     * will return null for this key unless another
     * name is added with the same key.
     */
    @Override
    public void remove(int key) {
        if (map[key].equals(""))
            System.out.println("Key not removed - Was not used");
        else {
            map[key] = "";
            counter--;
        }
    }

    /**
     * Returns true if there are no workers in the map,
     * false otherwise
     */
    @Override
    public boolean isEmpty() {
        if (counter == 0)
            return(true);
        else
            return(false);
    }

}
