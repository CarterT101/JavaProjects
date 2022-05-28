abstract class Laptop {
    public abstract void laptopSound();
    public void laptopCPU() {
        System.out.println("has 8 cores");
    }
}
// not possible to create an object of this class because it is abstract
// to access, must be inherited from another class using polymorphism

class Apple extends Laptop {
    public void laptopSound() {
        System.out.println("This laptop is quiet...");
    }
}

interface Computer {
    public void computerSound(); // interface methods that do not have a body
    public void turnOn();
}

// implementing interface into class to access and change methods, just like abstract
class Asus implements Computer {
    public void computerSound() {
        System.out.println("Asus is loud...");
    }
    public void turnOn() {
        System.out.println("Asus computer turned on...");
    }
}