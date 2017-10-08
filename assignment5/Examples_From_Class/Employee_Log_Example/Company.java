import java.util.ArrayList;
public class Company
{
 public static void main(String[] args)
 {
   ArrayList<Employee> empList= new ArrayList<Employee>();
   monthlyPaidEmp  mpE1 = new monthlyPaidEmp("John William" , 55675.00);
    monthlyPaidEmp mpE2 = new monthlyPaidEmp("Nancy William" , 65675.00);
    hourlyPaidEmp  hpE1 = new hourlyPaidEmp("Samira Monid", 7.50, 35);



    empList.add(mpE1);
    empList.add(mpE2);
    empList.add(hpE1);

    for(int i=0; i<empList.size() ; i++)
    {
		Employee e= empList.get(i);
		e.calculateSalary();
		empList.set(i,e);

	}

  for(int i=0; i<empList.size() ; i++)
    {
		System.out.println(empList.get(i));

	}

 }
}