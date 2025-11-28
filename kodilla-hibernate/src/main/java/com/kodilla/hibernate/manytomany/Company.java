package com.kodilla.hibernate.manytomany;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
       name = "Company.retrieveCompaniesNameStartsWith",
       query = """
       Select * from COMPANIES 
       where substring(COMPANY_NAME, 1, 3) = :NAME_STARTS_WITH
       """,
       resultClass = Company.class
)

@NamedQuery(
        name = "Company.retrieveCompaniesByPartOfTheName",
        query = "from Company where name like concat('%',:ARG,'%')"
)


@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID",  unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'';

    }
}
