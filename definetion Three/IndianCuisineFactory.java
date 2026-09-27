class IndianCuisineFactory extends AbstractFactory
{
   public MainCourse createMainCourse()
   {
       return new IndianMainCoursep();
   }

   public Appetizer createAppetizer()
   {
       return new IndianAppetizer();
   }
   
   public Dessert createDessert()
   {
       return new IndianDessert();
   } 
}
