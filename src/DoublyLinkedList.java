/**
 * Created by PierreM on 07/12/2014.
 */
public class DoublyLinkedList<T> {

    private class Node<T> {
        T item;
        Node<T> pNode;
        Node<T> nNode;
    }

    private Node<T> head;

    public DoublyLinkedList (T value) {
        head = new Node<T>();
        head.item = value;
        head.pNode = null;
        head.nNode = null;
    }

    public void addPatient(T newNode) {
        if (nNode == null) {
            nextPatient = newPatient;
            newPatient.previousPatient = this;
        }
        else
            this.nextPatient.addPatient(newPatient);
    }

    public boolean deletePatient(PatientDL oldPatient) {
        if (this.nextPatient == null) {
            System.out.println("Patient "+oldPatient.name+" not found");
            return (false);
        } else {
            if (this.nextPatient.name.equals(oldPatient.name)) {
                this.nextPatient = nextPatient.nextPatient;
                this.nextPatient.previousPatient = this;
                return (true);
            } else
                return (this.nextPatient.deletePatient(oldPatient));
        }
    }

    public void printPatientList() {
        PatientDL first = this;
        PatientDL last = this;
        PatientDL current = this;
        while (current != null) {
            System.out.println("Name: " + current.name + " Age: " + current.age + " Illness: " + current.illness);
            if (current.nextPatient == null)
                last = current;
            current = current.nextPatient;
        }
        current = last;
        System.out.println();
        System.out.println("Name: " + current.name + " Age: " + current.age + " Illness: " + current.illness);
        while (current != first) {
            System.out.println("Name: " + current.previousPatient.name + " Age: " + current.previousPatient.age + " Illness: " + current.previousPatient.illness);
            current = current.previousPatient;
        }
        System.out.println("END OF PRINT (FW & BW)");
    }

    public int patientListLengthIterative() {
        PatientDL tempPatient = this;
        int counter = 1;
        while (tempPatient.nextPatient != null) {
            counter++;
            tempPatient = tempPatient.nextPatient;
        }
        return (counter);
    }

}
