package model;

import javax.persistence.Embeddable;

@Embeddable
public class Weapons {
	
	private String lethalWeapons;
	private String typeOfWeapons;
	public String getLethalWeapons() {
		return lethalWeapons;
	}
	public void setLethalWeapons(String lethalWeapons) {
		this.lethalWeapons = lethalWeapons;
	}
	public String getTypeOfWeapons() {
		return typeOfWeapons;
	}
	public void setTypeOfWeapons(String typeOfWeapons) {
		this.typeOfWeapons = typeOfWeapons;
	}
	public Weapons(String lethalWeapons, String typeOfWeapons) {
		super();
		this.lethalWeapons = lethalWeapons;
		this.typeOfWeapons = typeOfWeapons;
	}
	public Weapons() {
		super();
	}
	@Override
	public String toString() {
		return "Weapons [lethalWeapons=" + lethalWeapons + ", typeOfWeapons=" + typeOfWeapons + "]";
	}
	
	
	

}
