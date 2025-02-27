public class HelloWorld {
    public static void main(String[] args) {
        message1();
    }
    static void message1()
    {  message2();
        System.out.println("Hello World 5");

    }
    static void message2()
    { message3();
        System.out.println("Hello World 4");

    }
    static void message3()
    { message4();
        System.out.println("Hello World 3");

    }
    static void message4()
    {    message5();
        System.out.println("Hello World 2");

    }
    static void message5()
    {
        System.out.println("Hello World 1");
    }
}
