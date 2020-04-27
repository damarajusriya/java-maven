package com.hexa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name = "employee")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name = "id")
private int id;

@Column(name = "name")
private String name;

public Employee(int id, String name) {
super();
this.id = id;
this.name = name;
}
@Override
public String toString() {
return "Employee [id=" + id + ", name=" + name + "]";
}
public void setId(int id) {
this.id = id;
}
public void setName(String name) {
this.name = name;
}
public int getId() {
return id;
}
public String getName() {
return name;
}
public Employee() {
// TODO Auto-generated constructor stub
} }
