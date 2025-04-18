public class QueueMain {
    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation(12);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);
        queue.insert(90);
        queue.insert(100);
        queue.insert(110);

        queue.display();
        System.out.println("\nfront is : "+queue.front());
        System.out.println("Remove First : "+queue.remove());
        queue.display();
    }
}
