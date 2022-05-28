class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
// subclass inheriting from above superclass and changing its method using polymorphism
class Pig extends Animal {
    public void animalSound() {
        System.out.println("This pig says: wee wee");
    }
}