import java.util.List;

public class Student {
    private String name;
    private int grade;
    private List<String> subjects;

    public Student(String name, int grade, List<String> subjects) {
        this.name = name;
        this.grade = grade;
        this.subjects = subjects;
    }

    public String getName() { return name; }
    public int getGrade() { return grade; }
    public List<String> getSubjects() { return subjects; }

    @Override
    public String toString() {
        return name + " - Grade: " + grade + ", Subjects: " + subjects.size();
    }
}

