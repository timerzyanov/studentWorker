@WorkerAnnotation
public class Worker implements Person {
    private String name;

    public String getName() {
        name = "Worker";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
