
/**
 * ParkedCar Info.
 *
 * @author (cherry cui)
 * @version (20200127)
 */

import java.util.Calendar;

public class ParkedCar {

    // instance variables
    private String ownerName;
    private String carMake;
    private int modelYear;
    private String carLicensePlateNumber;
    private int minutesParked;
    private int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    /**
     * Parameterized Constructor for objects of class ParkedCar
     * 
     * @param inputOwnerName               is Owner name
     * @param inputCarMake               is Car make
     * @param inputModelYear          is Car model year
     * @param inputLicensePlateNumber is Car license plate number
     * @param inputMinutesParked      is Number of minutes parked
     */
    public ParkedCar(String inputOwnerName, String inputCarMake, int inputModelYear,
     String inputLicensePlateNumber, int inputMinutesParked) {

        // validate instance variables
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

    /**
     * Method - Display Details
     *
     * @param inputName               is Owner name
     * @param inputMake               is Car make
     * @param inputModelYear          is Car model year
     * @param inputLicensePlateNumber is Car license plate number
     * @param inputMinutesParked      is Number of minutes parked
     * 
     */
    public void displayDetails() {
        System.out.println(ownerName);
        System.out.println(carMake);
        System.out.println(modelYear);
        System.out.println(carLicensePlateNumber);
        System.out.println(minutesParked);


        System.out.println(currentYear);

    }
}
