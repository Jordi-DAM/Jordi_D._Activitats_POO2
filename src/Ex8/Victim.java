package Ex8;

public class Victim {

    private String name;
    private int age;
    private String status;

    public Victim(String name, int age, String status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Nom de la víctima: " + name + " - Edat de la víctima: " + age + " - Estat de la víctima: " + status;
    }
}

