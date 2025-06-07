
public class Student{
    private String name;
    private int age;
    private float grade;

    public Student(String name, int age, float grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString(){
        return name + " " + age + " " + grade;
    }
}
