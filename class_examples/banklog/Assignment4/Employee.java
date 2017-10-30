public class Employee
{
  private String first_name, last_name;
  private int age;
  private double baseSalary;
  private Address address;

  public Employee()
  {
     first_name = "";
     last_name = " ";
     age = 0;
     baseSalary =0;
     address = new Address();

  }

  public void setName(String first_name, String last_name)
  {
     this.first_name = first_name;
     this.last_name = last_name;

  }

  public void setAge(int age)
  {
     this.age = age;
  }

  public void setAddress(String streetName, String city, String state, int zipcode)
  {
     address.changeAddress(streetName, city, state, zipcode);
  }

  public void setBaseSalary(double baseSalary)
  {
	  this.baseSalary = baseSalary;

  }

  public String toString()
  {

	  return "First name : "+ first_name + "\t" + "Last name:  " + last_name+ "\t" + "Base Salary: " + baseSalary + "\n Address:" + address.toString();


  }


}