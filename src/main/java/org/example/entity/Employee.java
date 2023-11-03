package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "pa_surname")
    private String paSurname;
    @Column(name = "ma_surname")
    private String maSurname;
    @Column(name = "email")
    private String email;
    @Column(name = "salary")
    private Double salary;
    @Column(name = "curp")
    private String curp;

    public Employee() {
    }

    public Employee(Integer id, String firs_name, String pa_surname, String ma_surname, String email, Double salary, String curp) {
        this.id = id;
        this.firstName = firs_name;
        this.paSurname = pa_surname;
        this.maSurname = ma_surname;
        this.email = email;
        this.salary = salary;
        this.curp=curp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firs_name) {
        this.firstName = firs_name;
    }

    public String getPaSurname() {
        return paSurname;
    }

    public void setPaSurname(String pa_surname) {
        this.paSurname = pa_surname;
    }

    public String getMaSurname() {
        return maSurname;
    }

    public void setMaSurname(String ma_surname) {
        this.maSurname = ma_surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + firstName + '\'' +
                ", pa_surname='" + paSurname + '\'' +
                ", ma_surname='" + maSurname + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +'\''+
                ", curp=" + curp +
                '}';
    }

}
