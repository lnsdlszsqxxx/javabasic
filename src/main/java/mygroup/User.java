package mygroup;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User {
    long id;
    long age;
    String name;
    static int x=0;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
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
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id &&
                age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        x++;
        return x;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User u1=new User();
        User u2=new User();

        Map<User, Integer> student=new HashMap<>();

        u1.setAge(30);
        u1.setId(1);
        u1.setName("Hang");

        u2.setAge(30);
        u2.setId(1);
        u2.setName("Hang");
        u1.equals(u2);

        student.put(u1,100);
        student.put(u2,88);

        System.out.println(student.toString());
        System.out.println(student.get(u1));


    }

}
