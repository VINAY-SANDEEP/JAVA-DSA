class Student {
    // private data (hidden from outside)
    private String name;
    private int age;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public int getAge() {
        return age;
    }

    // Setter method with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        // setting values using setters
        s.setName("Vinay");
        s.setAge(20);

        // getting values using getters
        System.out.println(s.getName() + " is " + s.getAge() + " years old");
    }
}
