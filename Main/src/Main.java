
// importing a package class
// this package is used to get user input
// java.util is a package while Scanner is a class of that package

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
    static class SecondInnerClass {
        int z = 3;
        public int innerMethod() {
            return z;
        }
    }
}

// enum represents group of constants
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Main implements Runnable {
    // variable, AKA attribute of the class. another term for class attributes is 'fields'
    int testVar;
    int testVar1;
    // creating a method. myMethod is name, static means the method belongs to Main class and not object of
    // Main class. static does not have to have an objected created for it.
    // void means that this method does not have to return value.
    // method must be declared within class
    static void myMethod() {
        System.out.println("Executed the method");
    }

    // method with parameters
    public void fullThrottle(int speed) { System.out.println("This car is going " + speed); }

    // creating class constructor for Main class. constructor name MUST match class name
    // these variables / fields will be initialized in object at creation time
    public Main() {
        testVar = 8;
    }
    public Main(int y) {
        testVar1 = y;
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied, you are less than 18 years old");

        } else {
            System.out.println("Access granted.");
        }
    }
    public static void main(String[] args) {
        // creating an object of the class and using a value defined within it. can create multiple objects of one class
        Main myObj = new Main();
        // calling the instructor is creating an object of the class Main
        Main myObj2 = new Main();
        System.out.println("This is a test variable: " + myObj.testVar);
        myObj.testVar = 40;
        System.out.println("New test variable: " + myObj.testVar);
        System.out.println("Unchanged variable with different object: " + myObj2.testVar);
        Main myObj3 = new Main(5);
        System.out.println("Inputting parameter into constructor: " + myObj3.testVar1);
        // calling the method
        myMethod();
        // creating new object to call a method and input parameter
        Main newCar = new Main();
        newCar.fullThrottle(200);

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        OuterClass.SecondInnerClass secondInner = new OuterClass.SecondInnerClass();
        System.out.println("Adding inner objects and outer object: " + (myInner.y + myOuter.x + secondInner.z));
        System.out.println("Running inner class method: " + secondInner.innerMethod());

        // creating object of class inheriting from abstract class
        Apple myApple = new Apple();
        myApple.laptopSound();

        // implementing interface class to access and change methods
        Asus myAsus = new Asus();
        myAsus.turnOn();

        // for each, looping through ENUM using .values() method
        for (Level myLvl : Level.values()) {
            System.out.println(myLvl);
        }
        // creating instance of ENUM named 'Level' with its value being 'HIGH'
        Level myLvl = Level.HIGH;
        // printing value of ENUM created object
        System.out.println("Enum object: " + myLvl);
        switch (myLvl) {
            case LOW -> System.out.println("Low");
            case MEDIUM -> System.out.println("Medium");
            case HIGH -> System.out.println(("High"));
        }

        // creating date and time object and displaying it
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current time is: " + currentDate + "\nAnd this is the current time: " + currentTime);
        // formatting datetime
        LocalDateTime currentDateTime = LocalDateTime.now(); // creating datetime object
        // formatting it in different ways
        DateTimeFormatter fcurrentDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter fcurrentDateTime1 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String formattedDate = currentDateTime.format(fcurrentDateTime);
        String formattedDate1 = currentDateTime.format(fcurrentDateTime1);
        System.out.println("Current Date Time is: " + formattedDate);
        System.out.println("Current Date Time is better formatted: " + formattedDate1);

        // this is a normal array, fixed-size
        String[] arrayTest = {"Volvo", "Tesla", "BMW"};
        // this is java.util array, it can be modified, added onto, removed from
        ArrayList<String> cars = new ArrayList<String>(); // creates an Array list

        cars.add("Volvo");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Ford");

        System.out.println(cars);

        System.out.println("Cars ArrayList");
        // for each loop to iterate through Cars list
        for (String l : cars) {
            System.out.println(l);
        }

        cars.remove("Ford");
        System.out.println("New list after 'removing' method");
        for (String l : cars) {
            System.out.println(l);
        }

        System.out.println("Index of 'Tesla': " + cars.indexOf("Tesla"));

        System.out.println("Index 2: " + cars.get(2));

        cars.set(2, "Subaru");
        System.out.println("Index 2 after 'set' method: " + cars.get(2));
        Collections.sort(cars);
        System.out.println("Sorted Cars List: ");
        for (String l : cars) {
            System.out.println(l);
        }
        System.out.println("Cars ArrayList size: " + cars.size());
        cars.clear();
        System.out.println("Cars ArrayList size after clear: " + cars.size());

        // creating LinkedList
        LinkedList<String> IOTList = new LinkedList<String>();
        IOTList.add("Fridge");
        IOTList.add("Microwave");
        System.out.println("Internet of things list: " + IOTList);
        IOTList.addLast("TV");
        System.out.println("'addLast' method" + IOTList);

        // HashMap

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("United States", "New York");
        System.out.println("HashMap: " + capitalCities);
        System.out.println("'.get' method, finding index 'Germany': " + capitalCities.get("Germany"));
        System.out.println(capitalCities.size());
        capitalCities.remove("Germany");

        // hashset, every item must be unique
        HashSet<String> phones = new HashSet<String>();
        phones.add("iPhone");
        phones.add("Samsung");
        phones.add("Google");
        System.out.println("This is a Hashset, every item has to be unique: " + phones);
        System.out.println("Does this hashset contain 'iPhone'? finding using '.contains()' method, returns bool: " +
                phones.contains("iPhone"));

        // Iterator, object that cna loop through collections

        Iterator<String> itPhones = phones.iterator();
        System.out.println("Quick way iteration: ");
        itPhones.forEachRemaining((phone) -> System.out.println(phone));

        // resets 'iterator' iteration
        itPhones = phones.iterator();
        // prints first item
        System.out.println("First item: " + itPhones.next());
        // looping through collection, previous .next() method that was used counts as first,
        // so the only other two items will be looped through in this loop
        while (itPhones.hasNext()) {
            System.out.println(itPhones.next());
        }

        // Wrapper class, way to use primitive data types as objects, must use when using Collection objects, where
        // primitive types cannot be used as the list can only store objects
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        // Wrapper object
        Integer myInt = 5;
        System.out.println("Wrapper object: " + myInt);
        // converting wrapper object to String and then finding length of new String
        String myString = myInt.toString();
        System.out.println(myString.length());

        // try and catch statements
        // this will fail because there is no index 10, so it tries it and then throws an exception
        try {
            int[] testNumbers = {1, 2, 3, 4};
            System.out.println(testNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
            // executes code regardless of result
        } finally {
            System.out.println("try catch is finished. ");
        }

        // throw new exception practice via method created above
        checkAge(19); // valid
        // checkAge(15); // fail

        // regular expression, regex practice
        // searching for pattern "Cart" in a sentence. Pattern created using Pattern.compile()
        // first parameter indicates which pattern is being searched for, second para has a flag to
        // indicate that the search should not be case-sensitive. second para is optional.
        // matcher() method is used to search for pattern in String. returns Matcher object.
        // find() method returns true if pattern was found.

        String regexTest = "Hello World, my name is Carter";
        Pattern pattern = Pattern.compile("Cart", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(regexTest);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found.");
        } else {
            System.out.println("Match not found");
        }

        // thread practice

        // extends example
        // thread can be run by creating instance of class and calling start() method
        testThread thread = new testThread();
        thread.start();

        // implement example
        // thread can be run by passing instance of class to
        // Thread Object's constructor and calling thread's start() method

        Main obj = new Main();
        Thread thread1 = new Thread(obj);
        thread1.start();

        // lambda practice

        System.out.println("Lambda practice: ");
        ArrayList<Integer> newNumbs = new ArrayList<Integer>();
        newNumbs.add(5);
        newNumbs.add(4);
        newNumbs.add(3);
        newNumbs.add(7);
        newNumbs.add(9);
        newNumbs.forEach( (n) -> {
            System.out.println(n);
        });
        // OR
        System.out.println("More lambda practice: ");
        newNumbs.forEach(System.out::println);
        // OR
        System.out.println("OR another lambda, storing lambda in variable: ");
        // storing lambda expression in variable using Consumer interface
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        newNumbs.forEach( method );

        // syntax info
        int x = 5;
        int y = 3, z = 2;
        int a, b, c;
        a = b = c = 50;

        System.out.println("Hello World");
        // prints x = 5
        System.out.println("x = " + x);
        // prints sum of y + z
        System.out.println(y + z);
        System.out.println(a + b + c);

        String testOutput = "Hello, World";
        // prints length of string
        System.out.println(testOutput.length());
        // prints to uppercase
        System.out.println(testOutput.toUpperCase());
        // prints index of specified character, or where it begins, in this case 'W' finds it at index '7'
        System.out.println(testOutput.indexOf("Wor"));

        String testString = "! This is string concatination";
        // combines the strings in two different ways
        System.out.println(testOutput + testString);
        System.out.println(testOutput.concat(testString));

        // type 'sout' and hit tab to get fast System.out.println() shortcut
        x = 5;
        y = -3;
        // prints higher number of two variables, min() does same thing
        System.out.println(Math.max(x,y));
        // absolute value
        System.out.println(Math.abs(y));
        // prints out random number between 0 and 1.0, no arguments needed
        System.out.println(Math.random());
        // prints random numbers 0-100
        System.out.println((int)(Math.random() * 101));
        x = (int)(Math.random() * 11);
        System.out.println(x);
        if (x > 4) {
            System.out.println("x is greater than 4");
        } else if (x == 4) {
            System.out.println("x is equal to 4");
        } else {
            System.out.println("x is less than 4");
        }
        String result = (x > 4) ? "x is greater than 4" : "x is less than 4";
        System.out.println("Shorthand if...else: " + result);
        // shorthand if, else if, else
        // A = if, B = else if, Z = else
        // if A return X else if B return Y else return Z
        // syntax = A ? X : (B ? Y : Z);
        System.out.println((x > 4) ? "Greater than 4" : ((x == 4) ? "Equal to 4" : "Less than 4"));
        // switch statements, evaluates statement once, value compared with values of each case, then code executed
        switch (x) { // enhanced switch statement, type '-' and '>' to get the arrows
            case 1 -> System.out.println("x is 1");
            case 5 -> System.out.println("x is 5");
            case 6 -> System.out.println("x is 6");
            case 7 -> System.out.println("x is 7");
            default -> System.out.println("x is: " + x);
        }
        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println(String.format("The iteration is on %2d", i));
            i++;
        }

        // for loop, (first executed one time; second defines condition for executing code; third execute every time)
        for (i = 1; i < 6; i++) {
            System.out.println(i);
        }

        int[] testArray = {2, 5, 8, 9};
        System.out.println("Array length: " + testArray.length);
        System.out.println("Index 1: " + testArray[1]);

        // for each loop
        for (int l : testArray) {
            System.out.println(l);
        }

        // polymorphism, creating object of subclass using superclass method but changing it to conform to new class
        Animal myPig = new Pig();
        myPig.animalSound();

        // grabbing user input by making object of the class
        Scanner nameObj = new Scanner(System.in);
        System.out.println("Enter name");
        // Converting user input to necessary data type, String. nextLine method to read a complete line
        String myName = nameObj.nextLine();
        // accessing private variables through get/set variables
        Person myPerson = new Person();
        myPerson.setName(myName);
        System.out.println("Your name is: " + myPerson.getName());

    }
    public void run() {
        System.out.println("This code is running in a thread through 'implements'");
    }
}
