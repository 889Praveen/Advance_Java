interface HouseBuilder {
    void setFloors(int floors);
    void setRooms(int rooms);
    void setGarage(boolean hasGarage);
    void setSwimmingPool(boolean hasSwimmingPool);
    void setGarden(boolean hasGarden);
    House build();
}