public class Main {
    public static void main(String[] args) {
        AbstractFactory indianFactory = new IndianCuisineFactory();
        MainCourse indianMain = indianFactory.createMainCourse();
        Appetizer indianAppetizer = indianFactory.createAppetizer();
        Dessert indianDessert = indianFactory.createDessert();
        
        indianMain.cook();
        indianAppetizer.prepare();
        indianDessert.serve();
        
        AbstractFactory chineseFactory = new ChineseCuisineFactory();
        MainCourse chineseMain = chineseFactory.createMainCourse();
        Appetizer chineseAppetizer = chineseFactory.createAppetizer();
        Dessert chineseDessert = chineseFactory.createDessert();
        
        chineseMain.cook();
        chineseAppetizer.prepare();
        chineseDessert.serve();
    }
    
}
