import java.util.Scanner;

class ComplexNumbers {
    private int real;
    private int imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(ComplexNumbers other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    public void multiply(ComplexNumbers other) {
        int newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        int newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        this.real = newReal;
        this.imaginary = newImaginary;
    }

    public void print() {
        System.out.println(real + " + i" + imaginary);
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first complex number
        int real1 = scanner.nextInt();
        int imaginary1 = scanner.nextInt();
        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);

        // Read the second complex number
        int real2 = scanner.nextInt();
        int imaginary2 = scanner.nextInt();
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        // Read the choice
        int choice = scanner.nextInt();

        // Perform the corresponding operation
        if (choice == 1) {
            c1.plus(c2);
			c1.print();
        } else if (choice == 2) {
            c1.multiply(c2);
			c1.print();
        }

        

        scanner.close();
    }
}
/* You're correct that the plus and multiply methods of the ComplexNumbers class receive the other object as a parameter, but they don't explicitly declare new int variables for the real and imaginary parts of the other object. Instead, they access the real and imaginary variables directly from the other object.

Let's take a closer look at the code to understand why:

java
Copy code
public void plus(ComplexNumbers other) {
    this.real += other.real;
    this.imaginary += other.imaginary;
}

public void multiply(ComplexNumbers other) {
    int newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
    int newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
    this.real = newReal;
    this.imaginary = newImaginary;
}
In the plus method, other is an object of the ComplexNumbers class. By using other.real and other.imaginary, the code accesses the real and imaginary variables of the other object directly. This is possible because the real and imaginary variables are declared as instance variables within the ComplexNumbers class, and they can be accessed by any method of that class.

Similarly, in the multiply method, the code accesses the real and imaginary variables of the other object using other.real and other.imaginary.

By accessing the real and imaginary variables directly from the other object, there is no need to declare additional int variables for the real and imaginary parts within the methods.

In summary, the code uses the other object as a parameter in the plus and multiply methods, and it accesses the real and imaginary variables of the other object directly. This is possible because the real and imaginary variables are instance variables within the ComplexNumbers class and can be accessed by any method of that class without the need for additional declarations. */