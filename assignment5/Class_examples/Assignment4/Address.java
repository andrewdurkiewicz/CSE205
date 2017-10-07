class Address
{
   private String streetName, city, state;
   private int zipcode;

   public Address()
   {
       streetName="";
       city = "";
       state= "";
       zipcode=0;
   }

   public Address(String streetName, String city, String state, int zipcode)
   {
      this.streetName= streetName;
      this.city = city;
      this.state = state;
      this.zipcode = zipcode;

   }

  public void changeAddress(String streetName, String city, String state, int zipcode)
  {
	   this.streetName= streetName;
	   this.city = city;
	   this.state = state;
       this.zipcode = zipcode;


  }

  public String toString()
  {
	  return streetName + "\n" + city +"\n" + state + "\n" + zipcode;
  }












}