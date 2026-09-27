public class BuilderPatternExample {
    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();
        builder.setFloors(3);

        House hs = builder.build();
        System.out.println(hs.showHouse());
    }
}