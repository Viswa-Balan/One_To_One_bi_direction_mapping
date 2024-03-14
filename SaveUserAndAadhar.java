package org.jpa.onetoonebiApp;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUserAndAadhar 
{

	public static void main(String[] args)
	{
         User user=new User();
         user.setName("DEF");
         user.setPhone(88992342l);
         AadharCard card=new AadharCard();
         card.setNumber(667694495125l);
         card.setDob(LocalDate.parse("1909-06-08"));
         card.setCity("Krishnagiri");
         
         EntityManagerFactory factory=Persistence.createEntityManagerFactory("OneToOneBi");
         EntityManager manager=factory.createEntityManager();
         EntityTransaction transaction = manager.getTransaction();
         manager.persist(user);
         manager.persist(card);
         transaction.begin();
         transaction.commit();
	}

}
