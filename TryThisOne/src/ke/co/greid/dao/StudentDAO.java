package ke.co.greid.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import ke.co.greid.entities.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Component
public class StudentDAO {
	
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	//convinience method
	public Session getLocalSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Autowired
	public void setDataSource(DataSource jdbc){
		this.jdbc=new NamedParameterJdbcTemplate(jdbc);
	}
	
	public List<Student> getStudents(){
		return jdbc.query("SELECT * FROM hims.student", new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int arg1) throws SQLException {
				Student student=new Student();
				student.setIdstudent(rs.getInt("idstudent"));
				student.setFirstName(rs.getString("first_name"));
				student.setMiddleName(rs.getString("middle_name"));
				student.setIdstudent(rs.getInt("age"));
				return student;
			}
		});
	}
	
	@SuppressWarnings("unchecked")
	public List<Student> getStudentsV2(){
		return getLocalSession().createQuery("FROM Student").list();
		//return jdbc.query("SELECT * FROM hims.student", BeanPropertyRowMapper.newInstance(Student.class));
	}
}
