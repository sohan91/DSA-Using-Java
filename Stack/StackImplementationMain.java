public class StackImplementationMain {
    public static void main(String[] args) {
        StackImplementation stackImplementation = new StackImplementation();
        stackImplementation.push(10);
        stackImplementation.push(30);
        stackImplementation.push(3);
        stackImplementation.push(11);
        stackImplementation.push(10);
        stackImplementation.push(30);
        stackImplementation.push(3);
        stackImplementation.push(11);
        stackImplementation.push(11);
        stackImplementation.push(14);
        stackImplementation.push(10);
        stackImplementation.push(30);
        stackImplementation.push(3);
        stackImplementation.push(11);
        stackImplementation.push(10);
        stackImplementation.push(30);
        stackImplementation.push(3);
        stackImplementation.push(11);
        stackImplementation.push(11);
        stackImplementation.push(14);
        System.out.println("peak is : "+stackImplementation.peek());


        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.pop());

        System.out.println("Another Stack : ");
        DynamicStack dynamicStack = new DynamicStack();
        dynamicStack.push(20);
        dynamicStack.push(30);
        dynamicStack.push(22);
        dynamicStack.push(40);
        dynamicStack.push(34);
        dynamicStack.push(50);
        dynamicStack.push(52);
        dynamicStack.push(69);
        dynamicStack.push(32);
        dynamicStack.push(40);
        dynamicStack.push(34);
        dynamicStack.push(50);
        dynamicStack.push(30);
        dynamicStack.push(22);
        dynamicStack.push(40);
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());

    }
}
