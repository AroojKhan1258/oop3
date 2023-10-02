import java.util.ArrayList;
import java.util.List;

class Lab {
    private String labID;
    private List<Computer> computers;
    private LabStatus status;
    private Employee labAttendant;

    public Lab(String labID, Employee labAttendant) {
        this.labID = labID;
        this.computers = new ArrayList<>();
        this.status = LabStatus.INACTIVE;
        this.labAttendant = labAttendant;
    }

    public String getLabID() {
        return labID;
    }

    public LabStatus getStatus() {
        return status;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer fetchComputer(String computerID) {
        for (Computer computer : computers) {
            if (computer.getComputerID().equals(computerID)) {
                return computer;
            }
        }
        return null; // Computer not found
    }

    public void changeLabStatus(LabStatus newStatus) {
        this.status = newStatus;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }
}