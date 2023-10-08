import java.util.ArrayList;
import java.util.List;

class University {
    private List<Lab> labs;

    public University() {
        labs = new ArrayList<>();
    }

    public void addLab(Lab lab) {
        labs.add(lab);
    }

    public void removeLab(Lab lab) {
        labs.remove(lab);
    }

    public Lab fetchLab(String labID) {
        for (Lab lab : labs) {
            if (lab.getLabID().equals(labID)) {
                return lab;
            }
        }
        return null; // Lab not found
    }

    public void printLabDetails(String labID) {
        Lab lab = fetchLab(labID);
        if (lab != null) {
            System.out.println("Lab ID: " + lab.getLabID());
            System.out.println("Lab Status: " + lab.getStatus());
            System.out.println("Lab Attendant: " + lab.getLabAttendant().getName());
            System.out.println("Computers in the Lab:");
            for (Computer computer : lab.getComputers()) {
                System.out.println("- Computer ID: " + computer.getComputerID());
                System.out.println("  Brand: " + computer.getBrand());
                System.out.println("  Model: " + computer.getModel());
            }
        } else {
            System.out.println("Lab not found.");
        }
    }
}

