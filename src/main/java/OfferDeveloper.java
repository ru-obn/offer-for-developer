public class OfferDeveloper {
    public static void main(String[] args) {
        final int offerOneCompensation = 6000;
        final double offerOneTime = 1.05;
        final int offerTwoCompensation = 5000;
        final double offerTwoTime = 1.15;
        final double offerOne = (offerOneCompensation / offerOneTime);
        final double offerTwo = (offerTwoCompensation / offerTwoTime);
        if (offerOne > offerTwo) {
            System.out.println("Выбирай первое предложение.");
        } else {
            System.out.println("Выбирай второе предложение.");
        }
    }
}