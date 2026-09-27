

abstract class EmployeeFactory {
  
  public static EmployeeFactory getEmployee(String type)
   {
      if (type.equalsIgnoreCase("webdeveloper"))
       {
        return new WebFactory();
       }
      else if (type.equalsIgnoreCase("androiddeveloper")) 
      {
        return new androidfactory();
      } 
       
      return null; 
  }

 
  abstract Employee createDeveloper();
}
