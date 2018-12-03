package com.mindtree.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String name;
	private String password;
	private String fullName;
	private String emailid;
	private String dob;
	private String gender;
	private String securityQuestion;
	private String securityAnswer;
	//private String type;
	
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public Employee(String name, String password, String fullName, String emailid, String dob, String gender,
			String securityQuestion, String securityAnswer) {
		super();
		this.name = name;
		this.password = password;
		this.fullName = fullName;
		this.emailid = emailid;
		this.dob = dob;
		this.gender = gender;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", password=" + password + ", fullName=" + fullName + ", emailid=" + emailid
				+ ", dob=" + dob + ", gender=" + gender + ", securityQuestion=" + securityQuestion + ", securityAnswer="
				+ securityAnswer + "]";
	}
	
	
}
