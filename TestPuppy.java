// Define the superclass

class Animal {
    void eat() {
        System.out.println("Animal can eat");
    }
}

// Define the intermediate class

class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}

// Define the subclass

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy can weep");
    }
}

// Test the subclass

public class TestPuppy {
    public static void main(String args[]) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}

# Output:
# 'Animal can eat'
# 'Dog can bark'
# 'Puppy can weep'
