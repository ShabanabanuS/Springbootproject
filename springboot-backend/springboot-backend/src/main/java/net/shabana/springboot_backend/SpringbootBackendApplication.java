package net.shabana.springboot_backend;

import net.shabana.springboot_backend.model.Employee;
import net.shabana.springboot_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee();
		employee.setFirstName("Shabana");
		employee.setlastName("banu");
		employee.setEmailId("Shabana@gmail.com");
		employeeRepository.save(employee);

		Employee employee1=new Employee();
		employee1.setFirstName("siva");
		employee1.setlastName("selvi");
		employee1.setEmailId("Selvi@gmail.com");
		employeeRepository.save(employee1);

	}
}
