public class Second {
    public static void main(String[] args) {
        // creating object of other class and outputting variable within other class
        Main myObject = new Main();
        System.out.println(myObject.testVar);

        // calling 'public' method by creating objected of class
        Main anotherCar = new Main();
        anotherCar.fullThrottle(200);
        // calling 'static' method by using class name
        Main.myMethod();
    }
}
