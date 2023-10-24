package a1024;

public class Person {
    private String name;
    private int age;
    private String gender;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
