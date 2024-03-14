package org.jpa.onetoonebiApp;

import java.time.LocalDate;

import javax.persistence.*;
@Entity
public class AadharCard 
{
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	 private int id;
	 @Column (nullable=false,unique=true)
	 private long number;
	 @Column(nullable = false)
	 private LocalDate dob;
	 @Column(nullable = false)
	 private String city;
	 @OneToOne(mappedBy = "card")
	 private User user ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
