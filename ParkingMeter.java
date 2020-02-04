
/**
 * ParkingMeter information.
 *
 * @author Cherry Cui
 * @version 2020-02-02
 */
public class ParkingMeter
{
    // instance variables
    private String meterLocation;
    private boolean hasACamera;
    private double priceOfOneMinuteInCAD;
    private int numberOfPurchasedMinutes;

    /**
     * Parameterized Constructor for objects of class ParkingMeter
     * @param inutLocation to set meter location value
     * @param ifHasCamera to set if it has a camera
     * @param inputPrice to set pirce of one minute in CAD
     * @param inputNumber to set number of purchased minutes
     */
    public ParkingMeter(String inputLocation, boolean ifHasCamera, double inputPrice, int inputMinutes)
    {
        // initialise instance variables
        if(inputLocation != null){
           meterLocation = inputLocation;
        } else {
        throw new IllegalArgumentException ("meter location cannot be null");
        };
        
        if(inputPrice > 0){
          priceOfOneMinuteInCAD = inputPrice;
        } else {
        throw new IllegalArgumentException ("price of one minute should be greater than 0");
        }
        
        if(inputMinutes >0){
           if (inputMinutes <= 180){
            numberOfPurchasedMinutes = inputMinutes;
            } else{
            numberOfPurchasedMinutes = 180;
            throw new IllegalArgumentException ("number of purchased minutes cannot be greater than 180, the value will set to 180");
            
            }
        }else {
        throw new IllegalArgumentException ("number of purchased minutes cannot be 0 or negative");
        }
        
        hasACamera = ifHasCamera;
    }
    

    /**
     * Method getMeterLocation
     * @return meter location value
     */
    public String getMeterLocation()
    {
        return meterLocation;
    }
    
    /**
     * Method getHasACamera
     * @return has a camera value
     */
    public boolean getHasACamera()
    {
        return hasACamera;
    }
    
    /**
     * Method getPriceOfOneMinuteInCAD
     * @return price of one minute in CAD value
     */
    public double getPriceOfOneMinuteInCAD()
    {
        return priceOfOneMinuteInCAD;
    }
    
    /**
     * Method getNumberOfPurchasedMinutes
     * @return number of purchased minutes value
     */
    public int getNumberOfPurchasedMinutes()
    {
        return numberOfPurchasedMinutes;
    }
    
    /**
     * Method setMeterLocation
     * @param inputlocation to set meter location value
     */
    public void setMeterLocation(String inputLocation)
    {
        if(inputLocation != null){
          meterLocation = inputLocation;
        }else {
        throw new IllegalArgumentException ("meter location cannot be null");
        }
    }
    
    /**
     * Method setHasACamera
     * @param ifHasCamera to set has a camera value
     */
    public void setHasACamera(boolean ifHasCamera){
      hasACamera = ifHasCamera;
    }
    
    /**
     * Method setPriceOfOneMinuteInCAD
     * @param inputPrice to set price of one minute in CAD value
     */
    public void setPriceOfOneMinuteInCAD(double inputPrice){
      if(inputPrice > 0){
          priceOfOneMinuteInCAD = inputPrice;
        } else {
        throw new IllegalArgumentException ("price of one minute should be greater than 0");
        }
    }
    
    /**
     * Method setNumberOfPurchasedMinutes
     * @param inputMinutes to set number of purchased minutes value
     */
    public void setNumberOfPurchasedMinutes(int inputMinutes){
        if(inputMinutes >0){
           if (inputMinutes <= 180){
            numberOfPurchasedMinutes = inputMinutes;
            } else{
            numberOfPurchasedMinutes = 180;
            throw new IllegalArgumentException ("number of purchased minutes cannot be greater than 180, the value will set to 180");
            
            }
        }else {
        throw new IllegalArgumentException ("number of purchased minutes cannot be 0 or negative");
        }
    }
    
    /**
     * Method displayDetails to display parking meter details
     * 
     */
    public void displayDetails(){
      System.out.println ("meter location: " + meterLocation);
      System.out.println ("meter have a camera: " + hasACamera);
      System.out.println ("price of one minute in CAD: " + priceOfOneMinuteInCAD);
      System.out.println ("number of purchased minutes: " + numberOfPurchasedMinutes);
    }
}

