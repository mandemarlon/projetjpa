package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;


//@Table(name = "Avengers")
//@Inheritance(strategy = InheritanceType.JOINED)

@Entity 
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Avengers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	int age;

	public Avengers(Long id, String nom, int age) {
		super();
		this.id = id;
	
		this.age = age;
	}

	public Avengers() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Avengers [id=" + id + ", nom=" + ", age=" + age + "]";
	}

}
