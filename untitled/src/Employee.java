class Employee {
    private String employeeID;
    private String name;
    private static String designation = "Lab Attendant";

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    // Getter and Setter methods for employeeID
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter method for designation (static)
    public static String getDesignation() {
        return designation;
    }

    // Setter method for designation (static)
    public static void setDesignation(String newDesignation) {
        designation = newDesignation;
    }
}
