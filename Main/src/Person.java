public class Person {
    private String name;

    // getter, returns value of the variable 'name'
    public String getName() {
        return name;
    }

    // setter, takes parameter and assigns it to the 'name' variable with 'this' keyword
    // 'this' used to refer to current object
    // 'name' variable declared as private, we cannot access it from outside this class
    public void setName(String newName) {
        this.name = newName;
    }
}
