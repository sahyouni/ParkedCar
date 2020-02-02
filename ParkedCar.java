
import java.util.Calendar;

public class ParkedCar {

    private String ownerName;
    private String carMake;
    private int modelYear;
    private String carLicensePlateNumber;
    private int minutesParked;
    private int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    private void ThrowIfNull(String valueToValidate, String errorMessage) {
        if (valueToValidate == null)
            throw new IllegalArgumentException(errorMessage);
    }

    public String GetOwnerName() {
        return ownerName;
    }

    public void SetOwnerName(String value){
        ThrowIfNull(value, "owner name cannot be null");
        ownerName = value;
    }

    public String GetCarMake() {
        return carMake;
    }

    public void SetCarMake(String value) {
        ThrowIfNull(value, "car make cannot be null");
        carMake = value;
    }

    public int GetModelYear() {
        return modelYear;
    }

    public void SetModelYear(int value){
        if(value <1900)
        throw new IllegalArgumentException("year model cannot be earlier than 1900");

        if(value > currentYear)
        throw new IllegalArgumentException("year model cannot be later than 2020");

        modelYear = value;
    }

    public String GetLicensePlateNumber() {
        return carLicensePlateNumber;
    }
    public void SetLicensePlateNumber(String value){
        ThrowIfNull(value, "car license plate number cannot be null");
        carLicensePlateNumber = value;
    }

    public ParkedCar(String inputOwnerName, String inputCarMake, int inputModelYear, String inputLicensePlateNumber,
            int inputMinutesParked) {

        ThrowIfNull(inputOwnerName, "owner name cannot be null");
        ThrowIfNull(inputCarMake, "car make cannot be null");
        ThrowIfNull(inputLicensePlateNumber, "car license plate number cannot be null");

        if (inputModelYear < 1900) {
            throw new IllegalArgumentException("year model cannot be earlier than 1900");
        }
        if (inputModelYear > currentYear) {
            throw new IllegalArgumentException("year model cannot be later than 2020");
        }
      
        if (inputMinutesParked <= 0) {
            throw new IllegalArgumentException("minutes parked should be greater than 0");
        }

        ownerName = inputOwnerName;
        carMake = inputCarMake;
        modelYear = inputModelYear;
        carLicensePlateNumber = inputLicensePlateNumber;
        minutesParked = inputMinutesParked;
    }

    public void displayDetails() {
        System.out.println("------------");

        System.out.println(ownerName);
        System.out.println(carMake);
        System.out.println(modelYear);
        System.out.println(carLicensePlateNumber);
        System.out.println(minutesParked);
        System.out.println(currentYear);

        System.out.println("------------");


    }
}
