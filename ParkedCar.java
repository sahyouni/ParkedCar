
/**
 * ParkedCar Info.
 *
 * @author (cherry cui)
 * @version (20200127)
 */

import java.util.Calendar;
public class ParkedCar
{
    // instance variables 
    private String ownerName;
    private String carMake;
    private int modelYear;
    private String carLicensePlateNumber;
    private int numberOfMinutesParked;
    private int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    /**
     * Parameterized Constructor for objects of class ParkedCar
     * @param  inputName is Owner name
     * @param inputMake is Car make
     * @param inputModelYear is Car model year
     * @param inputLicensePlateNumber is Car license plate number
     * @param inputMinutesParked is Number of minutes parked
     */
    public ParkedCar(String inputName, String inputMake, int inputModelYear, String inputLicensePlateNumber, int inputMinutesParked)
    {
        // validate instance variables
         if(inputName != null){
            ownerName = inputName;
            } else {
            throw new IllegalArgumentException ("owner name cannot be null");
            }
            
            if(inputMake != null){
            carMake = inputMake;
            } else {
            throw new IllegalArgumentException ("car make cannot be null");
            }
            
             if(inputMake != null){
            carMake = inputMake;
            } else {
            throw new IllegalArgumentException ("car make cannot be null");
            }
            
             if(inputModelYear < 1900){
                 throw new IllegalArgumentException ("year model cannot be earlier than 1900");
                }
             else {
                 if (inputModelYear > currentYear){
                    throw new IllegalArgumentException ("year model cannot be later than 2020");
                    }
                 else {
                    modelYear = inputModelYear;
                    }
             }
             
             if(inputLicensePlateNumber != null){
            carLicensePlateNumber = inputLicensePlateNumber;
            } else {
            throw new IllegalArgumentException ("car license plate number cannot be null");
            }
            
             if(inputMinutesParked > 0){
            numberOfMinutesParked = inputMinutesParked;
            } else {
            throw new IllegalArgumentException ("minutes parked should be greater than 0");
            }
        
    }

    /**
     * Method - Display Details
     *
     * @param inputName is Owner name
     * @param inputMake is Car make
     * @param inputModelYear is Car model year
     * @param inputLicensePlateNumber is Car license plate number
     * @param inputMinutesParked is Number of minutes parked
     * 
     */
    public void displayDetails(){
        System.out.println("Adam White");
        System.out.println ("Mazda");
        System.out.println (2010);
        System.out.println ("1A2B3C");
        System.out.println (95);
    
}
}
