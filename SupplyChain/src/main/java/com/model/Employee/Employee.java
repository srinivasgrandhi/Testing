package com.model.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;
 
@NamedNativeQueries({
	@NamedNativeQuery(
	name = "callEmployeeSP",
	query = "call GetEmployee(:empID)",
	resultClass = Employee.class
	)
})
 
@Entity
@Table(name = "employee")
public class Employee{
 
	private int emp_id;
	private String emp_name;
	private String emp_Last_name;
	@Id
	@GeneratedValue
	@Column(name = "emp_id")
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
 
 
	@Column(name = "emp_name")
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}	
}