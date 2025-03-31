public class PerformingRemovingDuplication {
    public static void main(String[] args) {
        Operation operation1 = new Operation();
        operation1.insertAtLast(1);
        operation1.insertAtLast(3);
        operation1.insertAtLast(5);
//        operation.insertAtLast(30);
//        operation.insertAtLast(30);
//        operation.insertAtLast(40);
//        operation.removeDuplication();
//        operation.display();

        Operation operation2 = new Operation();
        operation2.insertAtLast(1);
        operation2.insertAtLast(2);
        operation2.insertAtLast(9);
        operation2.insertAtLast(14);
        operation2.mergeSortedList(operation1,operation2);
        Operation answer = new Operation();
        answer = answer.mergeSortedList(operation1,operation2);
        answer.display();

    }
}
