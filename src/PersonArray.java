public class PersonArray {
    public static void main(String[] args) {
        Person[] persons = new Person[3]; // количество ссылок 1
        persons[0] = new Person("Zelim", 2008); // количество ссылок 1
        persons[1] = new Person("Ruslan", 1999);
        persons[2] = new Person("Ilyas", 1991);

        for (int i = 0; i < 3; i++) {
            if ((2024 - persons[i].getBirthYear()) < 18) {
                System.out.println("Иди спать, сынок!");
            } else {
                System.out.println("Заходи");
            }
            System.out.println(persons[i].getName());
        }
        persons[0].setName("Evgenii");
        System.out.println(persons[0].getName());
    }
}

class Person {
    private String name;
    private int birthYear;

    String getName() {
        return name;
    }

    int getBirthYear() {
        return birthYear;
    }

    void setName(String name) {
        this.name = name;
    }

    Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
}

