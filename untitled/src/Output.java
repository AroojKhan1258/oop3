class Output{
    public static void main(String[] args) {
        University university = new University();

        Employee labAttendant = new Employee("E001", "John Doe");
        Lab lab1 = new Lab("Lab1", labAttendant);

        Computer computer1 = new Computer("C1", "Dell", "Latitude");
        Computer computer2 = new Computer("C2", "HP", "EliteBook");

        lab1.addComputer(computer1);
        lab1.addComputer(computer2);

        university.addLab(lab1);

        // Fetch and print lab details
        university.printLabDetails("Lab1");
    }
}

