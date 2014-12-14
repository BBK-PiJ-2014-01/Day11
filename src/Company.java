/**
 * Created by Pierre on 14/12/2014.
 */
public class Company {
    public static void main(String[] args) {
        Company c = new Company();
        c.run();
    }

    void run() {
        DoublyLinkedList<String> employeeNameList = new DoublyLinkedList<String>();
        employeeNameList.addItem("Smith");
        employeeNameList.addItem("Blogg");
        employeeNameList.addItem("Meyer");
        employeeNameList.addItem("Doe");
        employeeNameList.addItem("Locke");
        employeeNameList.addItem("Holt");
        employeeNameList.addItem("Lotus");
        employeeNameList.printList();

        DoublyLinkedList<Integer> employeeNINList = new DoublyLinkedList<Integer>();
        employeeNINList.addItem(45);
        employeeNINList.addItem(36);
        employeeNINList.addItem(12);
        employeeNINList.addItem(6);
        employeeNINList.addItem(78);
        employeeNINList.addItem(9);
        employeeNINList.addItem(5);
        employeeNINList.printList();

    }
}
