package task4;

import java.io.IOException;
import java.nio.CharBuffer;

public class Employee implements Calculateable, Displayable, Readable{
	private int hoursPerWeek;
	private int salaryPerHour;
	private int yearsOfService;
	public Employee() {
		this.hoursPerWeek = 0;
		this.salaryPerHour = 0;
		this.yearsOfService = 0;
	}
	
	public Employee(int hoursPerWeek, int salaryPerHour, int yearsOfService) {
		this.hoursPerWeek = hoursPerWeek;
		this.salaryPerHour = salaryPerHour;
		this.yearsOfService = yearsOfService;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public int getSalaryPerHour() {
		return salaryPerHour;
	}

	public void setSalaryPerHour(int salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}

	public int getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double weeklySalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double annualSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
