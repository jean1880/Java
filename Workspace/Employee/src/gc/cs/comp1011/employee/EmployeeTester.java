package gc.cs.comp1011.employee;

public class EmployeeTester {

	public static void main(String[] args) {
		
		//assigning a subclass reference to a subclass variable
		SalariedEmployee se = new SalariedEmployee("John Smith","1234",800);
		HourlyEmployee he = new HourlyEmployee("Karen Price","2345",16.75,40);
		//assigning a superclass reference to a superclass variable
		CommissionEmployee ce = new CommissionEmployee("Sue Jones", "3456", 10000, 0.06);
		BasePlusCommissionEmployee bce= new BasePlusCommissionEmployee("Bob Lewis", "5678", 5000, 0.04, 300);
		
		//printing all the details
		System.out.println(se);
		System.out.printf("%-25s: $%.2f\n", "Weekly Salary", se.getEarnings());
		System.out.println("----------------------------------------------------");
		System.out.println(he);
		System.out.printf("%-25s: $%.2f\n", "Weekly Salary", he.getEarnings());
		System.out.println("----------------------------------------------------");
		System.out.println(ce);
		System.out.printf("%-25s: $%.2f\n", "Weekly Salary", ce.getEarnings());
		System.out.println("----------------------------------------------------");
		System.out.println(bce);
		System.out.printf("%-25s: $%.2f\n", "Weekly Salary", bce.getEarnings());
		System.out.println("----------------------------------------------------");
		
		//create an employee array
		Employee[] employees = new Employee[4];
		
		//assigning subclass references to superclass variable
		employees[0] = se;
		employees[1] = he;
		employees[2] = ce;
		employees[3] = bce;
		
		System.out.println("Employees processed polymorphically");
		
		for(Employee currentEmployee : employees){
			System.out.println(currentEmployee);
			System.out.println("------------------------------------------");
			//can I call a subclass method for currentEmployee-NO
			//currentEmployee.setWeeklySalary();
			
			//increase the salary of BasePlusCommission employee by 10%
			if (currentEmployee instanceof BasePlusCommissionEmployee)
			{
				//downcast currentEmployee to a BasePlusCommission employee
				//assigning a superclass reference to a subclass is a compilation error 
				//so explicitly cast it
				//BasePlusCommissionEmployee bcet = currentEmployee;
				BasePlusCommissionEmployee bcet =(BasePlusCommissionEmployee) currentEmployee;
				bcet.setBaseSalary(1.10 * bcet.getBaseSalary());
				
				System.out.println(bcet);
				System.out.println("------------------------------------");
				
				
			}//end of if
		}//end for for
			//get type name of each object
			for(int i = 0; i < employees.length; i++)
				System.out.printf("Employee at position %d is a %s\n",i,
						          employees[i].getClass().getName());
			
			
		
	}

}
