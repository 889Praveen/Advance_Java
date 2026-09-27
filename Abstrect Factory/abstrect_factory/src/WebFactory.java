
class WebFactory extends EmployeeFactory {

   @Override
   Employee createDeveloper() 
   {
       return new WebDeveloper();
   } 
}