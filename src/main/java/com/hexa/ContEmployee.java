package com.hexa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Contractemployee") /*
@AttributeOverrides({
 @AttributeOverride(name="id", column=@Column(name="id")),
 @AttributeOverride(name="name", column=@Column(name="name"))
}) */
public class ContEmployee extends Employee{
 @Column(name="pay_per_hour")
 private float pay_per_hour;

 @Column(name="contract_duration")
 private String contract_duration;
public void setContract_duration(String contract_duration) {
this.contract_duration = contract_duration;
}
public String getContract_duration() {
return contract_duration;
}
public void setPay_per_hour(float pay_per_hour) {
this.pay_per_hour = pay_per_hour;
}
public float getPay_per_hour() {
return pay_per_hour;
}
@Override
public String toString() {
return "PerEmployee [pay_per_hour=" + pay_per_hour + "contract_duration=" + contract_duration + "]";
}
public ContEmployee() {
// TODO Auto-generated constructor stub
}
public ContEmployee(float pay_per_hour, String contract_duration) {
super();
this.pay_per_hour = pay_per_hour;
this.contract_duration = contract_duration;
}
}