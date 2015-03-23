package ke.co.greid.entities;

// Generated Mar 23, 2015 2:25:21 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name = "course")
public class Course implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8400359850464503984L;
	private Integer idcourse;
	private String name;
	private String description;
	private Set<Student> students = new HashSet<Student>(0);

	public Course() {
	}

	public Course(String name, String description, Set<Student> students) {
		this.name = name;
		this.description = description;
		this.students = students;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idcourse", unique = true, nullable = false)
	public Integer getIdcourse() {
		return this.idcourse;
	}

	public void setIdcourse(Integer idcourse) {
		this.idcourse = idcourse;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "student_has_course", catalog = "hims", joinColumns = { @JoinColumn(name = "course_idcourse", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "student_idstudent", nullable = false, updatable = false) })
	public Set<Student> getStudents() {
		return this.students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}