package com.java8;

import java.util.ArrayList;
import java.util.Date;
//test
public class Employee {
	
	    private String name;
	    private String department;
	    private String status;
	    private Date doj;
	    private String dept;
	    private int age;
	    
	    public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
		public Employee(String name, String department, String status, Date doj, String dept, int age) {
			super();
			this.name = name;
			this.department = department;
			this.status = status;
			this.doj = doj;
			this.dept = dept;
			this.age= age;
		}

		public String getName() {
	        return name;
	    }
	    public String getDepartment() {
	        return department;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setDepartment(String department) {
	        this.department = department;
	    }
	    public String getStatus() {
	        return status;
	    }
	    public void setStatus(String status) {
	        this.status = status;
	    }

		public Date getDoj() {
			return doj;
		}

		public void setDoj(Date doj) {
			this.doj = doj;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	    
		
	    
}
