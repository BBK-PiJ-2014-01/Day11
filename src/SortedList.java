/**
 * Created by Pierre on 14/12/2014.
 */
public class SortedList<T> extends DoublyLinkedList<T> {

    @Override
    public void addItem(T value) {
        Node<T> newNode = new Node<T>(value);
        if (head == null)
            head = newNode;
        else
            head.linkNode(newNode);
        listLength++;
    }
}
