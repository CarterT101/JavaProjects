class Vehicle {
    protected String brand = "Ford"; // vehicle attribute
    public void honk() {            // vehicle method
        System.out.println("Tuut, tuut!");
    }
}
class Car extends Vehicle {
    private String modelName = "Mustang";   // Car attribute
    public static void main(String[] args) {
        // creating car object
        Car myCar = new Car();
        // calling honk method
        myCar.honk();
        // displaying values  from attributes from Vehicle class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}