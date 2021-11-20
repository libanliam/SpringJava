package com.csa.samplefullstack.entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_employee")
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private String name;
    private String department;
    private String location;

    public employee(int employeeId, String name, String department, String location) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.location = location;
    }

    public employee(){

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

