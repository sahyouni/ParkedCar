class QuickStart {
    public static void main(String[] args) {
        ParkedCar car = new ParkedCar("Rami", "Nissan", 2000, "FW952L", 5);
        car.displayDetails();

        car.SetCarMake("Toyota");
        car.displayDetails();

        car.SetLicensePlateNumber("FFFFWWWWGGGG");
        car.displayDetails();

        car.SetModelYear(1999);
        car.displayDetails();

        car.SetOwnerName("Borat");
        car.displayDetails();

    }
}