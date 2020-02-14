class QuickStart {
    public static void main(String[] args) {

        // Test1();
        Test2();

    }

    private static void Test2() {
        BookClub club = new BookClub("", 4);
        int count = club.calculateBookPoints();

        System.out.println("book points: " + count);

       //static method is shared among all instance of a class
      int total =  BookClub.getTotalNumberOfSoldBooks();
      System.out.println("total: " + total);


    }

    private static void Test1() {
        PrintTotalNumberOfBooksSold();

        BookClub wackyJackie = new BookClub("Wacky Jackie", 3);
        PrintBookClubDetails(wackyJackie);
        PrintTotalNumberOfBooksSold();

        wackyJackie.setNumberOfPurchasedBooksPerMonth(5);
        PrintBookClubDetails(wackyJackie);
        PrintTotalNumberOfBooksSold();

        wackyJackie.setNumberOfPurchasedBooksPerMonth(10);
        PrintBookClubDetails(wackyJackie);

        PrintTotalNumberOfBooksSold();
        BookClub cherrysFruits = new BookClub("Cherry's fresh fruits and salads", 100);
        PrintBookClubDetails(cherrysFruits);

        PrintTotalNumberOfBooksSold();

        BookClub samsWorkOutRoutine = new BookClub("Build a six pack in two hours", 5);
        PrintBookClubDetails(samsWorkOutRoutine);

        PrintTotalNumberOfBooksSold();
    }

    private static void PrintTotalNumberOfBooksSold() {
        System.out.println(
                "-----total number of sold books sold so far is " + BookClub.getTotalNumberOfSoldBooks() + "---------");
    }

    private static void PrintBookClubDetails(BookClub bookClub) {
        System.out.println(bookClub.getClientName() + " book club has " + bookClub.calculateBookPoints()
                + " points and has purchased " + bookClub.getNumberOfPurchasedBooksPerMonth() + " books per month.");
    }
}