
/**
 * ParkedCar Info.
 *
 * @author (cherry cui)
 * @version (20200202)
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
     * @param  inputName to set Owner name
     * @param inputMake to set Car make
     * @param inputModelYear to set Car model year
     * @param inputLicensePlateNumber to set license plate number
     * @param inputMinutesParked to set Number of minutes parked
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
                    throw new IllegalArgumentException ("year model cannot be later than current year");
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
     * Method - getOwnerName
     * @return the owner name value
     */
    public String getOwnerName(){
           return ownerName;
    }
    
    /**
     * Method - getCarMake
     * @return the car make value
     */
    public String getCarMake(){
           return carMake;
    }
    
    /**
     * Method - getModelYear
     * @return the model year value
     */
    public int getModelYear(){
           return modelYear;
    }
    
    /**
     * Method - getCarLicensePlateNumber
     * @return the car license plate number value
     */
    public String getCarLicensePlateNumber(){
           return carLicensePlateNumber;
    }
    
    /**
     * Method - getCarLicensePlateNumber
     * @return the car license plate number value
     */
    public int getNumberOfMinutesParked(){
           return numberOfMinutesParked;
    }
    
    /**
     * Method - setOwnerName
     * @param inputName A parameter to set owner name value
     */
    public void setOwnerName(String inputName){
           if(inputName != null){
              ownerName = inputName;
            } else {
              throw new IllegalArgumentException ("owner name cannot be null");
            };
    }
    
    /**
     * Method - setCarMake
     * @param inputMake A parameter to set car make value
     */
    public void setCarMake(String inputMake){
           if(inputMake != null){
              carMake = inputMake;
            } else {
              throw new IllegalArgumentException ("car make cannot be null");
            };
    }
    
    /**
     * Method - setModelYear
     * @param inputYear A parameter to set car model year value
     */
    public void setModelYear(int inputModelYear){
           if(inputModelYear < 1900){
                 throw new IllegalArgumentException ("year model cannot be earlier than 1900");
                }
             else {
                 if (inputModelYear > currentYear){
                    throw new IllegalArgumentException ("year model cannot be later than current year");
                    }
                 else {
                    modelYear = inputModelYear;
                    }
    }
}
    /**
     * Method - setCarLicensePlateNumber
     * @param inputLicensePlateNumber A parameter to set car license plate number value
     */
    public void setCarLicensePlateNumber(String inputLicensePlateNumber){
           if(inputLicensePlateNumber != null){
              carLicensePlateNumber = inputLicensePlateNumber;
            } else {
              throw new IllegalArgumentException ("car license plate number cannot be null");
            };
    }
    
    /**
     * Method - setNumberOfMinutesParked
     * @param inputMinutesParked A parameter to set number of minutes parked value
     */
    public void setNumberOfMinutesParked(int inputMinutesParked){
           if(inputMinutesParked > 0){
              numberOfMinutesParked = inputMinutesParked;
            } else {
              throw new IllegalArgumentException ("number of minutes parked should be greater than 0");
            };
    }
    
    /**
     * Method - Display Details to display car parking details
     *
     * @param inputName is Owner name
     * @param inputMake is Car make
     * @param inputModelYear is Car model year
     * @param inputLicensePlateNumber is Car license plate number
     * @param inputMinutesParked is Number of minutes parked
     * 
     */
    public void displayDetails(){
        System.out.println("Owner name: " + ownerName);
        System.out.println ("Car make: " + carMake);
        System.out.println ("Model year: " + modelYear);
        System.out.println ("Car license plate number: " + carLicensePlateNumber);
        System.out.println ("Number of minutes parked: " + numberOfMinutesParked);
    
}
}
