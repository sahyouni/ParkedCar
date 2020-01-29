
import java.util.Calendar;

public class ParkedCar {

    private String ownerName;
    private String carMake;
    private int modelYear;
    private String carLicensePlateNumber;
    private int minutesParked;
    private int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    public ParkedCar(String inputOwnerName, String inputCarMake, int inputModelYear,
     String inputLicensePlateNumber, int inputMinutesParked) {

        if (inputOwnerName == null) { throw new IllegalArgumentException("owner name cannot be null"); } 
        if (inputCarMake == null) { throw new IllegalArgumentException("car make cannot be null"); } 
        if (inputModelYear < 1900) { throw new IllegalArgumentException("year model cannot be earlier than 1900"); } 
        if (inputModelYear > currentYear) { throw new IllegalArgumentException("year model cannot be later than 2020"); }
        if (inputLicensePlateNumber == null) { throw new IllegalArgumentException("car license plate number cannot be null"); } 
        if (inputMinutesParked <= 0) { throw new IllegalArgumentException("minutes parked should be greater than 0"); } 

        ownerName = inputOwnerName;
        carMake = inputCarMake;
        modelYear = inputModelYear;
        carLicensePlateNumber = inputLicensePlateNumber;
        minutesParked = inputMinutesParked;
    }

    public void displayDetails() {
        System.out.println(ownerName);
        System.out.println(carMake);
        System.out.println(modelYear);
        System.out.println(carLicensePlateNumber);
        System.out.println(minutesParked);


        System.out.println(currentYear);

    }
}
