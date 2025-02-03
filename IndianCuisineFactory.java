class IndianCuisineFactory implements AbstractFactory
{
   public MainCourse createMainCourse()
   {
       return new ChineseMainCourse();
   }

   public Appetizer createAppetizer()
   {
       return new ChineseAppetizer();
   }
   
   public Dessert createDessert()
   {
       return new ChineseDessert();
   } 
}
