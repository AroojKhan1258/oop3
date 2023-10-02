class Computer {
    private String computerID;
    private String brand;
    private String model;

    public Computer(String computerID, String brand, String model) {
        this.computerID = computerID;
        this.brand = brand;
        this.model = model;
    }

    public String getComputerID() {
        return computerID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}enum LabStatus {
    ACTIVE, INACTIVE;
}