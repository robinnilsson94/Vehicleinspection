package Vehicleinspection.model;

/**
 * Represents one specific payment for one specific inspection. The inspection is payed
 * with creditcard.
 */
public class CardPayment {
    private int paidAmt;
    private int totalCost;

    /**
     * Creates a new instance. The customer paid the specified amount.
     *
     * @param paidAmt The amount of money that was charged from the customers creditcard.
     */
    public CardPayment(int paidAmt) {
        this.paidAmt = paidAmt;
    }
}
