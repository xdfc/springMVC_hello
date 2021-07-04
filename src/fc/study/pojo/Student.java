package fc.study.pojo;

public class Student {
    private int id;
    private String name;
    private String sex;
    private float grade;

    public Student(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public float getGrade() {
        return grade;
    }
}
