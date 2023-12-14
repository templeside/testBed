package beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Laptop3")
public class Laptop {

	@Id
	private int lid;
	private String lname;
	
	@OneToOne(targetEntity = Student.class,cascade = CascadeType.ALL)
	// parent and child
	@JoinColumn(name = "rollNo")
	private Student student;
	
	public Laptop() {
		super();
	}
	 

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
