class Car
{
   private int year;
   private String make;
   private String model;
   private Owner  owner;

   Car(int year, String make, String model)
   {
      this.year = year;
      this.make = make;
      this.model = model;
      this.owner = new Owner();
   }

  public void setOwner(String ownerName, String ownerAddress, String ownerPhoneNumber)
  {
     owner.setOwnerInfo(ownerName,ownerAddress,ownerPhoneNumber);
  }


  public String toString()
  {

     return "Car year: " + year + " make:" + make + " model:" + model + owner.toString();


  }


}