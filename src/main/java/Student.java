import javax.enterprise.inject.Alternative;

@Alternative
public class Student implements Person {
    private String name;

    public String getName() {
        name = "Student";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
