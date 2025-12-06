public class Main {

    static String classLevelVariable="This is class level variable";
    public static void main(String args[]){
       /*
        System.out.println("Hello World!");
        Greeting greeting=new Greeting();
        greeting.hello();

        */

        /*
        Messenger messenger=new Messenger();
        messenger.sendMessage();
        */

        String greeting="Hello World!";
        int number=5;
        boolean isJavaFun=true;

        System.out.println(greeting);
        System.out.println(number);
        System.out.println(isJavaFun);

        System.out.println(classLevelVariable);
        DisplayMessage();
    }


    public static void  DisplayMessage(){
        String Message="This is a local variable";
        System.out.println(Message);
    }
}
