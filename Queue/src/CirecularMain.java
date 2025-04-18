public class CirecularMain {
    public static void main(String[] args) {
        CircularQueueImplementation circularQueueImplementation = new CircularQueueImplementation();
        circularQueueImplementation.insert(10);
        circularQueueImplementation.insert(20);
        circularQueueImplementation.insert(30);
        circularQueueImplementation.insert(40);
        circularQueueImplementation.insert(50);

        circularQueueImplementation.display();
        System.out.println("Front is : "+circularQueueImplementation.front());
        System.out.println("Remove First is : "+circularQueueImplementation.remove());
        circularQueueImplementation.insert(80);
        circularQueueImplementation.display();
    }
}
