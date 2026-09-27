class ConcreteHouseBuilder implements HouseBuilder {
    private int floors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    @Override
    public void setFloors(int floors) {
        this.floors = floors;
       
    }

    @Override
    public void setRooms(int rooms) {
        this.rooms = rooms;
        
    }

    @Override
    public void setGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
       
    }

    @Override
    public void setSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
      
    }

    @Override
    public void setGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
       
    }

    @Override
    public House build() {
        return new House(floors, rooms, hasGarage, hasSwimmingPool, hasGarden);
    }
}