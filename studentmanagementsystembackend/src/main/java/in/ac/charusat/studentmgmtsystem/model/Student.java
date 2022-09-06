package in.ac.charusat.studentmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private Integer id;
    private String name;
    private Integer age;
    private String address;

    public Student(Integer id, String name,Integer age, String address) {
        this.id = id;
        this.name = name;
        this.age=age;
        this.address = address;
    }

    public Student() {

    }

    public Integer getId() {
        return id;
    }
    public Integer getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
