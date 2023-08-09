public class Human {
    private int age;
    private String gender;
    private String name;

    public Human() {
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


