class House {
    private int floors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    public House(int floors, int rooms, boolean hasGarage, boolean hasSwimmingPool, boolean hasGarden) {
        this.floors = floors;
        this.rooms = rooms;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasGarden = hasGarden;
    }

    public String showHouse() {
        return "House with " + floors + " floors, " + rooms + " rooms.\n" +
               "Garage: " + (hasGarage ? "Yes" : "No") + "\n" +
               "Swimming Pool: " + (hasSwimmingPool ? "Yes" : "No") + "\n" +
               "Garden: " + (hasGarden ? "Yes" : "No");
    }
}