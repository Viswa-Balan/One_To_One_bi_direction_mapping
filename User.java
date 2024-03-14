package org.jpa.onetoonebiApp;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class User 
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(nullable=false)
  private String name;
  @Column(nullable=false ,unique=true)
  private long phone ;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="aadharcard_id")
  private AadharCard card;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public AadharCard getCard() {
	return card;
}
public void setCard(AadharCard card) {
	this.card = card;
}
}
