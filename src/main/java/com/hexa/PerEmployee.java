package com.hexa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="regularemployee") /*
@AttributeOverrides({
 @AttributeOverride(name="id", column=@Column(name="id")),
 @AttributeOverride(name="name", column=@Column(name="name"))
})
*/
public class PerEmployee extends Employee {
@Column(name="salary")
private float salary;

@Column(name="bonus")
private int bonus;
public PerEmployee() {
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "PerEmployee [salary=" + salary + ", bonus=" + bonus + "]";
}
public PerEmployee(float salary, int bonus) {
super();
this.salary = salary;
this.bonus = bonus;
}
public void setBonus(int bonus) {
this.bonus = bonus;
}
public void setSalary(float salary) {
this.salary = salary;
}
public int getBonus() {
return bonus;
}
public float getSalary() {
return salary;
}
}