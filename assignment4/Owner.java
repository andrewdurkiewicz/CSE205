public class Owner
{

  private String name, address, phone;

  public Owner(String name, String address, String phone)
  {

     this.name = name;
     this.address = address;
     this.phone=phone;

  }

  public Owner()
    {

       this.name = "";
       this.address = "";
       this.phone="";

  }
  public void setOwnerInfo(String name, String address, String phone)
  {

	     this.name = name;
	     this.address = address;
         this.phone=phone;
  }


  public String toString()
  {

    return "\n Owner  " + name +" live at " + address + " and the phone number is" + phone;

  }


}