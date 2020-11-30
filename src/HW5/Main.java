package HW5;

public class Main {
    public static void main(String[] args) {
        Person[] stuff = new Person[5];
        stuff[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231254", 30000, 30);
        stuff[1] = new Person("Petrov Petr", "Cleaner","petrovp@yandex.ru", "89995836487", 23000, 47);
        stuff[2] = new Person("Stepanov Stepan", "Cook", "sstepan@mail.ru", "89885234787", 35000, 27);
        stuff[3] = new Person("Sidorova Marina", "Accountant", "sidormar@mail.ru", "89853654756", 40000, 54);
        stuff[4] = new Person("Smolnikova Irina", "Secretary", "smolirina@gmail.com", "89785632847", 27000, 29);

        for (int i = 0; i < stuff.length; i++) {
            if (stuff[i].getAge() > 40){
                System.out.println(stuff[i]);
            }
        }
    }
}
