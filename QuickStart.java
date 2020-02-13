class QuickStart {
    public static void main(String[] args) {

        System.out.println("-----total number of sold books:" + BookClub.totalNumberOfSoldBooks + "---------");

        BookClub wackyJackie = new BookClub("Wacky Jackie", 3);
        PrintDetails(wackyJackie);

        System.out.println(wackyJackie.getClientName() + "is about to set its purchased books to 5...");
        wackyJackie.setNumberOfPurchasedBooksPerMonth(5);
        PrintDetails(wackyJackie);

        wackyJackie.setNumberOfPurchasedBooksPerMonth(5);
        PrintDetails(wackyJackie);

        System.out.println("-----total number of sold books:" + BookClub.totalNumberOfSoldBooks + "---------");

        BookClub cherrysFruits = new BookClub("Cherry's fresh fruits and salads", 100);
        PrintDetails(cherrysFruits);

        System.out.println("-----total number of sold books:" + BookClub.totalNumberOfSoldBooks + "---------");

    }

    private static void PrintDetails(BookClub bookClub) {
        System.out.println(bookClub.getClientName() + " book club has " + bookClub.calculateBookPoints()
                + " points and has purchased " + bookClub.getNumberOfPurchasedBooksPerMonth() + " books per month");
    }
}