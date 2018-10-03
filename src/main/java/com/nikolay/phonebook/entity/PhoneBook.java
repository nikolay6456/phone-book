package com.nikolay.phonebook.entity;

public class PhoneBook{
    

	private int id;
	private long phone;
	private String firstName, secondName;

	public PhoneBook(int id, long phone, String firstName, String secondName) {
		this.id = id;
		this.phone = phone;
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public PhoneBook(){

	}

	public int getId(){return this.id;}
	public long getPhone(){return this.phone;}
	public String getFirstName(){return this.firstName;}
	public String getSecondName(){return this.secondName;}

	public void setId(int id){this.id = id;}
	public void setPhone(long phone){this.phone = phone;}
	public void setFirstName(String firstName){this.firstName = firstName;}
	public void setSecondName(String secondName){this.secondName = secondName;}



	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj == null && this.getClass() != obj.getClass()) return false;

		PhoneBook phone = (PhoneBook) obj;

		if(this.id != phone.id && this.phone != phone.phone) return false;
		if(this.firstName.equals(phone.firstName) && this.secondName.equals(phone.secondName)) return false;
		return true;

	}

	@Override
	public String toString(){
		return (this.getClass() +
			": id = " + this.id +
			"; phone: " + this.phone +
			"; firstName: " + this.firstName + 
			"; secondName: " + this.secondName);
	}

}