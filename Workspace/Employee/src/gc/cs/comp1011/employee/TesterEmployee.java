package gc.cs.comp1011.employee;

public class TesterEmployee {

	public static void main(String[] args) {
	
		CommissionEmployee ce1 = new CommissionEmployee("anju","1234",10000,0.5);
		
		System.out.println(ce1);
		System.out.format("%-25s: $%.2f\n", "Weekly Salary", ce1.getEarnings());
		System.out.println("------------------------------------");
		BasePlusCommissionEmployee bce1 = new BasePlusCommissionEmployee("anju","1234",20000,0.5, 10000);
		System.out.println(bce1);
		System.out.format("%-25s: $%.2f\n", "Weekly Salary", bce1.getEarnings());
		System.out.println("------------------------------------");
		SalariedEmployee se1 = new SalariedEmployee("Aaron","4444",1000);
		System.out.println(se1);
		System.out.format("%-25s: $%.2f\n", "Weekly Salary", se1.getEarnings());
		System.out.println("------------------------------------");
		HourlyEmployee he1 = new HourlyEmployee("Aaron","4444",1000,5);
		System.out.println(he1);
		System.out.format("%-25s: $%.2f\n", "Weekly Salary", he1.getEarnings());
		
	}

}
