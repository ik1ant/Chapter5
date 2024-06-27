class Person2 {
    private String name;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Person2(String name) {
        this.name = name;
    }
}

public class VarDemo {
    public static void main(String[] args) {
        var person = new Person2("Zelim");
        person.setName("Eugene");
        System.out.println(person.getName());
    }
}
