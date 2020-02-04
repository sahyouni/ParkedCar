class QuickStart {
    public static void main(String[] args) {
        ParkedCar car = new ParkedCar("Rami", "Nissan", 2000, "FW952L", 5);
        car.displayDetails();

        car.setCarMake("Toyota");
        car.displayDetails();

        car.setCarLicensePlateNumber("FFFFWWWWGGGG");
        car.displayDetails();

        car.setModelYear(1999);
        car.displayDetails();

        car.setOwnerName("Borat");
        car.displayDetails();

    }
}