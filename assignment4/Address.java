import java.util.*;

public class Address
{
	private String streetName, city, state;
	private int zipcode;
	public Address(String streetName, String city, String state, int zipcode)
	{
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		
	}
	public Address(){
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public void changeAddress(String streetName, String city, String state, int zipcode)
	{
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public String toString()
	{
		return "Address: " + streetName + "\n" + city + ", " + state + " " + zipcode;
	}
}
