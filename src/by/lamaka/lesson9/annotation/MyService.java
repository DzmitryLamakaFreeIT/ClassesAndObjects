package by.lamaka.lesson9.annotation;

import java.util.Objects;

@Version(numVersion = "1.0", nameVersion = "freeit")
public class MyService {
    private int id;
    private String name;

    public MyService() {
    }

    public MyService(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private void thisClassInfo() {
        System.out.println("id = " + id + " name = " + name);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return id == myService.id && Objects.equals(name, myService.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "MyService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
