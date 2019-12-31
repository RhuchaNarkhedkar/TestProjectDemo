package com.emp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.emp.dao.EmployeeRepository;
import com.emp.model.Employee;
import com.emp.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeDirectoryApplicationTests {

	@Spy
	@InjectMocks
	private EmployeeService service;

	@Mock
	private EmployeeRepository repository;

	@Test
	public void saveEmployeeTest() {
		Employee employee = new Employee("Narendra", "Modi");
		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, service.saveEmployee(employee));
	}

	@Test
	public void getAllTest() {
		when(repository.findAll()).thenReturn(Stream.of(new Employee("Akshay", "Kumar")).collect(Collectors.toList()));
		assertEquals(1, service.getAll().size());
	}

}
