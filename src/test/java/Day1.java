import com.sun.deploy.security.SelectableSecurityManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.security.x509.OtherName;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day1<result> {
    private String Mattese;

    @Test
    public void testMethod1() {
        System.out.println("This will be printed");
    }

    @Test
    public void testNumbers() {
        int myNumber = 5;
        double d = 4.5;
        System.out.println(myNumber);
        System.out.println(d);
    }

    @Test
    public void testCharsAndString() {
        char LetterG = 'g';
        String s2 = "Who who who who!";
        System.out.println(LetterG);
        System.out.println(s2);
    }

    @Test
    public void testConcat() {
        int numberOfCookies;
        numberOfCookies = 4;
        String message = "I have " + numberOfCookies + " cookies";
        System.out.println(message);
    }

    @Test
    public void testBoolean() {
        boolean b = false;
        System.out.println(b);
    }


    @Test
    public void testConditions() {
        int a = 5;

        if (a == 4) {
            System.out.println("Ohhh! So a is 4!");
        } else System.out.println("Ohhh! It is not 4");


    }

    @Test
    public void testForLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    @Test
    public void testNumbersInString() {
        int[] arrayOfInt = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i <= arrayOfInt.length; i++) ;
        System.out.println(arrayOfInt);
    }

    @Test
    public void testCars() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

    @Test
    public void testCountNumbers1() {
        String input = "Hello World";
        int result = 0;
        for (char eachChar : input.toCharArray()) {
            if (eachChar == 'l') result++;
        }
        System.out.println(result);
    }


    @Test
    public void test() {
        int[] intArr = {0, 1, 2, 3, 4};
        for (int num : intArr) {
            System.out.println(num);
        }
    }

    @Test
    public void testName() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    @Test
    public void testName1() {
        int[] intArr = {0, 1, 2, 3, 4};
        for (int num : intArr) {
            System.out.println(num);
        }
    }

    @Test
    public void testName2() {

        String[] names = {"James", "Larry", "Tom", "Lacy"};

        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
    }

    @Test
    public void testClassObjects() {
        Actor actor1 = new Actor();
        Actor actor2 = new Actor("Arnold", "Schwarzenegger", 5);
        actor2.act();
        actor2.play();
        actor2.retire();

    }

    @Test
    public void testLoops() {
        int i = 0;
        while (i < 5) {
            System.out.println("While loop: i = " + i);
            i++;
        }
    }

    @Test
    public void testDogs() {
        Dog Maltese = new Dog(Mattese, 18);

    }

    @Test
    public void testArrays3() {
        ArrayList<String> array = new ArrayList<String>();
        array.add("Volvo");
        array.add("Mazda");

        for (String i : array) {
            System.out.println(i);

        }

    }

    @Test
    public void testHaha() {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }

    @Test
    public void testNumberss() {

        int n = 7;
        if (n % 2 == 0)
            System.out.println("Even");
        else if (n == 0)
            System.out.println("Nothing");
        else
            System.out.println("Odd");
    }

    @Test
    public void testPrintEvenNumber() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.println(i);

        }
    }

    @Test
    public void testSwapTwoNumbers() {
        int month = 2;
        while (month == 1 || month == 2 || month == 12) {
            System.out.println("Winter");
            month++;

        }


    }

    @Test
    public void testPrivet() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars
        ) {
            System.out.println(i);

        }
    }

    @Test
    public void testHappiness() {
        String input="Hello World";
        int result=0;
        for (char eachChar:input.toCharArray()
             ) {
            if(eachChar=='p') result++;}
        System.out.println(result);


    }

    @Test
    public void testName89() {
    int[]array={1,2,3,4,5};
    swap(array, 1,2);
        System.out.println(Arrays.toString(array));

        }

    private void swap(int[] array, int IndexL, int IndexR) {
        int temp=array [IndexL];
        array[IndexL]=array[IndexR];
                array[IndexR]=temp;

    }
}

















