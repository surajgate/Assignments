package com.met.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.met.model.Registration;

//@Component

@Repository
public class RegistrationDAO {
	
	@Autowired
	@Qualifier("oracleDataSource")
	private DataSource oracleDataSource;
	

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private SessionFactory sessionFactory;
	

	
	public void save(Registration registration) {
		
		//saveUsingDataSource(employee);
		
		//saveUsingJDBCTemplate(employee);
		
		//saveUsingHibernate(employee);
		Session session = sessionFactory.getCurrentSession();
		session.save(registration);
		
		System.out.println("Saving emp to database: " + registration);
		
	}
	
	

	
	private void saveUsingJDBCTemplate(Registration registration) {
		
		jdbcTemplate.update("insert into Employeetbl values(?, ?, ?, ?)", 
					new Object[] {registration.getFName(), registration.getEmailId(), registration.getMobNo(),
							registration.getAddress(),registration.getPassword(),registration.getcPassword()}
				);
		
	}

	public  Collection<Registration> getAllUsers(){
		
		
		return jdbcTemplate.query("select * from REGISTRATION", 
				
					new BeanPropertyRowMapper<Registration>(Registration.class)
					//new EmployeeMapper()
				
				);
		
		
	}
	
	
	class RegistrationMapper implements RowMapper<Registration>{

		@Override
		public Registration mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			
			Registration registration = new Registration();
			
			registration.setFName(rs.getString("fname"));
			registration.setEmailId(rs.getString("emailId"));
			registration.setMobNo(rs.getInt("mobNo"));
			registration.setAddress(rs.getString("address"));
			registration.setPassword(rs.getString("password"));
			registration.setcPassword(rs.getString("cPassword"));
					
			return registration;
		}
	}
	
}








