class QuickStart {
    public static void main(String[] args) {

        PrintTotalNumberOfBooksSold();

        BookClub wackyJackie = new BookClub("Wacky Jackie", 3);
        PrintDetails(wackyJackie);

        wackyJackie.setNumberOfPurchasedBooksPerMonth(5);
        PrintDetails(wackyJackie);

        wackyJackie.setNumberOfPurchasedBooksPerMonth(10);
        PrintDetails(wackyJackie);

        PrintTotalNumberOfBooksSold();
        BookClub cherrysFruits = new BookClub("Cherry's fresh fruits and salads", 100);
        PrintDetails(cherrysFruits);

        PrintTotalNumberOfBooksSold();

        BookClub samsWorkOutRoutine = new BookClub("Build a six pack in two hours", 5);
        PrintDetails(samsWorkOutRoutine);

        PrintTotalNumberOfBooksSold();
    }

    private static void PrintTotalNumberOfBooksSold(){
        System.out.println("-----total number of sold books sold so far is " + BookClub.totalNumberOfSoldBooks + "---------");
    }

    private static void PrintDetails(BookClub bookClub) {
        System.out.println(bookClub.getClientName() + " book club has " + bookClub.calculateBookPoints()
                + " points and has purchased " + bookClub.getNumberOfPurchasedBooksPerMonth() + " books per month.");
    }
}