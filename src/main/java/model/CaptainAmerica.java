package model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@Table(name="IronMan")
//@PrimaryKeyJoinColumn(name = "id")

public class CaptainAmerica extends Avengers {
	

	
	private String nom ;
	
	
	@Embedded
	private Weapons weapons;



	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Weapons getWeapons() {
		return weapons;
	}

	public void setWeapons(Weapons weapons) {
		this.weapons = weapons;
	}

	public CaptainAmerica(Long id, String nom, int age, Long id2, String nom2, Weapons weapons) {
		super(id, nom, age);
		id = id2;
		nom = nom2;
		this.weapons = weapons;
	}

	public CaptainAmerica(Long id, String nom, int age) {
		super(id, nom, age);
	}
	
	
	


	public CaptainAmerica() {
		
	}

	@Override
	public String toString() {
		return "IronMan [id=" + id + ", nom=" + nom + ", weapons=" + weapons + "]";
	}
	
	
	
	

}
