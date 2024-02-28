package se.mycompany;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        int age = 32;
        System.out.println("Age: "+ age);

        double salary;
        salary = 3000.01;
        System.out.println("Salary: " + salary);

        boolean isStudant = true;
        boolean haveAccount = false;

        char a ='a';

        double test;
        test = 12.22;

        int number1 = 20;
        int number2 = 10;
        // arthimic operation

        int result = number1 + number2 ;
        System.out.println("Result: " + result);

        int number = 0;
        System.out.println(++number);

        int num1 = 10;
        int num2 = 20;
        boolean isEqual = num1 != num2 ;
        System.out.println(isEqual);

        double n1 = 5, n2 = 7, res = 0;
        char operator = '*';
        switch (operator){
            case '+':
                res = n1 + n2;
                break;
            case '-':
                res = n1 - n2;
                break;
            case '*':
                res = n1  * n2;
                break;
            default:
                System.out.println("Operator is not valid!");
        }
        System.out.println(res);

        String name = "Mohamed";
        name = name.concat(" Hussein");

        System.out.println("name = " + name);



    }
}
