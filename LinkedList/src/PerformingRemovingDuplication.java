public class PerformingRemovingDuplication {
    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.insertAtLast(20);
        operation.insertAtLast(20);
        operation.insertAtLast(30);
        operation.insertAtLast(30);
        operation.insertAtLast(30);
        operation.insertAtLast(40);
        operation.removeDuplication();
        operation.display();
    }
}
