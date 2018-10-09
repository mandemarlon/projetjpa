package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import model.IronMan;

import model.Weapons;



public class TestAvengerPersist {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			Weapons w1= new Weapons();
			w1.setLethalWeapons("laserbeam");
			w1.setTypeOfWeapons("armor");
			
			IronMan ironman = new IronMan();
			
			ironman.setNom("Stark");
			
			em.persist(ironman);
			
			
			
			txn.commit();

		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();

		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}

	}
}

