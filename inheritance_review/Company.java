import java.util.ArrayList;
public class Company
{

	public static void main(String[] args)
	{

		 Employee e1 = new Employee("John William" , 55675.00);
		 Employee e2 = new Employee("Nancy William" , 65675.00);
		 Employee e3 = new Employee("Samira Monid", 735);
		 e1.calculateSalary("John William" , 55675.03);
		 e2.calculateSalary("Nancy William" , 65675.00);
		 e3.calculateSalary("Samira Monid", 735);



		 System.out.println(e1);
		 System.out.println(e2);
		 System.out.println(e3);


	}
}