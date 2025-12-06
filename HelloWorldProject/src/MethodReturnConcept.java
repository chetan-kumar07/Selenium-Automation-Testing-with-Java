public class MethodReturnConcept {



    public static void main(String args[]) {
//        System.out.println(getGreeting());
//        System.out.println(addNumbers(2,5));
          Calculator calculator=new Calculator();
          int sum=calculator.add(10,5);
          System.out.println(sum);
          int difference=calculator.subtract(10,5);
          System.out.println(difference);
    }

    public static String getGreeting(){
        return "Hello, Welcome";
    }

    public static int addNumbers(int number1, int number2){
        return number1+number2;
    }
}
