
public class PayrollOffice {
	 public void paySalary(Employee employee) {
	        double salary = employee.calculateSalary();
	        System.out.println("Bu kadar maaş ödüyoruz " + salary + " TL " + employee.getName());
	    }

	    public static void main(String[] args) {
	        PayrollOffice payrollOffice = new PayrollOffice();

	        Employee employee = new Employee("Ahmet", "Yılmaz", "Employee");
	        Manager manager = new Manager("Mehmet", "Kaya");
	        Director director = new Director("Ayşe", "Demir");

	        payrollOffice.paySalary(employee);
	        payrollOffice.paySalary(manager);
	        payrollOffice.paySalary(director);
	    }

}
