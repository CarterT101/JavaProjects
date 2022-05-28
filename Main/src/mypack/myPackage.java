// package name should be written in lowercase to avoid conflict with class names
package mypack;
class myPackage {
    public static void main(String[] args){
        System.out.println("This is my package");
    }
}

// compile it by:
// javac myPackage.java
// then compile the package:
// javac -d . myPackage.java
// this forces compiler to create mypack package
// -d keyword specifies destination for where to save class file, '.' places package within same directory

// to run in terminal:
// java mypack.myPackage