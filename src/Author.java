public class Author {
    String name;
    String surname;
    int age;

    public Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String toString() {
        return "Имя: " + name + "\n" +
                "Фамилия: " + surname + "\n" +
                "Год рождения: " + age;
    }
}
