package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class EmpRepository {
	
	@Autowired
	private HomeRepository hr;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateEmp() {
		Employee e = new Employee();
		e.setId(55);
		e.setName("yy");
//		e.setProject("mm");
		e.setLocation("pune sez");
		e.setSuggestion_Category("corporate");
		e.setSuggestion_Description("oooo");

	
	Employee savedEmp = hr.save(e);
	
	Employee existEmp = entityManager.find(Employee.class, savedEmp.getId());
	
//	assertThat(existEmp.getId()).isEqualTo(e.getId());
	}

}
