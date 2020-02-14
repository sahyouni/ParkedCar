
/**
 * class BookClub that awards points to its customers.
 *
 * @author Cherry Cui
 * @version 2020-02-10
 */
public class BookClub {

    /**
     * Accessor getTotalNumberOfSoldBooks
     * 
     * @return total number of sold books
     */
    public static int getTotalNumberOfSoldBooks() {
        return totalNumberOfSoldBooks;
    }

    private static int totalNumberOfSoldBooks;

    // Symbolic Constants
    private static final int FIRST_LEVEL_POINTS = 5;
    private static final int SECOND_LEVEL_POINTS = 15;
    private static final int THIRD_LEVEL_POINTS = 30;
    private static final int FOURTH_LEVEL_POINTS = 60;

    private static final int FIRST_LEVEL_MAXNUMBER = 3;
    private static final int SECOND_LEVEL_MINNUMBER = 4;
    private static final int SECOND_LEVEL_MAXNUMBER = 7;
    private static final int THIRD_LEVEL_MINNUMBER = 8;
    private static final int THIRD_LEVEL_MAXNUMBER = 10;

    private static final int STARTING_POINT = 0;

    // Attributes
    private String clientName;
    private int numberOfPurchasedBooksPerMonth;

    /**
     * Parameterized Constructor
     * 
     * @param inputName   to set client name value
     * @param inputNumber to set number of purchased books per month
     */
    public BookClub(String inputClientName, int inputNumberOfPurchasedBooksPerMonth) {

        if (inputClientName == null)
            throw new IllegalArgumentException("client name cannot be null");

        if (inputNumberOfPurchasedBooksPerMonth <= 0)
            throw new IllegalArgumentException("number of purchased books must be positive");

        clientName = inputClientName;
        numberOfPurchasedBooksPerMonth = inputNumberOfPurchasedBooksPerMonth;
        totalNumberOfSoldBooks = totalNumberOfSoldBooks + numberOfPurchasedBooksPerMonth;
    }

    /**
     * Accessor getClientName
     * 
     * @return client name
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Accessor getNumberOfPurchasedBooksPerMonth
     * 
     * @return number of purchased books per month
     */
    public int getNumberOfPurchasedBooksPerMonth() {
        return numberOfPurchasedBooksPerMonth;
    }

    /**
     * Mutator setClientName
     * 
     * @param inputName to set cient name value
     */
    public void setClientName(String inputName) {
        if(inputName ==null){
            throw new IllegalArgumentException("client name cannot be null");
        }

        clientName = inputName;
    }

    /**
     * Mutator setNumberOfPurchasedBooksPerMonth
     * 
     * @param inputNumber to set number of purchased books per month
     */
    public void setNumberOfPurchasedBooksPerMonth(int inputNumber) {
        if(inputNumber <= 0){
            throw new IllegalArgumentException("number of purchased books must be positive");
        }
        numberOfPurchasedBooksPerMonth = inputNumber;
        totalNumberOfSoldBooks = totalNumberOfSoldBooks + inputNumber;
    }

    /**
     * 
     * Method calculateBookPoints
     * 
     * @return calculated book points
     */
    public int calculateBookPoints() {
        
        int points = STARTING_POINT;
        if (numberOfPurchasedBooksPerMonth > 0 && numberOfPurchasedBooksPerMonth < FIRST_LEVEL_MAXNUMBER) {
            points = STARTING_POINT + numberOfPurchasedBooksPerMonth * FIRST_LEVEL_POINTS;
        } else {
            if (numberOfPurchasedBooksPerMonth > SECOND_LEVEL_MINNUMBER
                    && numberOfPurchasedBooksPerMonth < SECOND_LEVEL_MAXNUMBER) {
                points = points + numberOfPurchasedBooksPerMonth * SECOND_LEVEL_POINTS;
            } else {
                if (numberOfPurchasedBooksPerMonth > THIRD_LEVEL_MINNUMBER
                        && numberOfPurchasedBooksPerMonth < THIRD_LEVEL_MAXNUMBER) {
                    points = points + numberOfPurchasedBooksPerMonth * THIRD_LEVEL_POINTS;
                } else {
                    points = points + numberOfPurchasedBooksPerMonth * FOURTH_LEVEL_POINTS;
                }

            }
        }
        return points;

    }
}
