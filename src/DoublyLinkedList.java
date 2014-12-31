/**
 * Created by PierreM on 07/12/2014.
 */
public class DoublyLinkedList<T> {

    protected class Node<T> {
        T item;
        Node<T> nNode;
        Node<T> pNode;

        public Node(T value) {
            item = value;
            nNode = null;
            pNode = null;
        }

        public T getItem() {
            return(item);
        }

        public void setItem(T value) {
            item = value;
        }

        public Node getNextNode(){
            return(nNode);
        }

        public void setNextNode(Node node) {
            nNode = node;
        }

        public Node getPreviousNode(){
            return(pNode);
        }

        public void setPreviousNode(Node node) {
            pNode = node;
        }

        public void linkNode(Node node) {
            if (this.getNextNode() == null) {
                this.setNextNode(node);
                node.setPreviousNode(this);
            }
            else
                this.getNextNode().linkNode(node);
        }

        public boolean unlinkNode(T value) {
            if (this == null) {
                return (false);
            } else {
                if (this.nNode.item.equals(value)) {
                    this.nNode = nNode.nNode;
                    this.nNode.pNode = this;
                    return (true);
                } else
                    return (this.nNode.unlinkNode(value));
            }
        }
    }

    protected Node<T> head;
    protected int listLength;

    public DoublyLinkedList () {
        head = null;
        listLength = 0;
    }

    public void addItem(T value) {
        Node<T> newNode = new Node<T>(value);
        if (head == null)
            head = newNode;
        else
            head.linkNode(newNode);
        listLength++;
    }

    public void deleteItem(T value) {
        boolean found = head.unlinkNode(value);
        if (found)
            listLength--;
        else
            System.out.println("Item not found");
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.item);
            current = current.nNode;
        }
    }

    public int getListLength() {
        return (listLength);
    }

}
