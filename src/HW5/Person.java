package HW5;

public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void personInfo() {
        System.out.printf("%s, %s, %s, %s, %d, %d\n", name, position, email, phone, salary, age);
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %d, %d", name, position, email, phone, salary, age);
    }
}
