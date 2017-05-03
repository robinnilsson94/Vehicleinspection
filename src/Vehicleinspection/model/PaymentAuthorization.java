package Vehicleinspection.model;

/**
 * Handles all communication with the payment authorization system.
 */
public class PaymentAuthorization {

    /**
     * Requests authorization for the specified payment.
     *
     * @param card   The card used for the payment.
     * @param amount The amount to pay.
     * @return <code>true</code> if the payment is authorized,
     *         <code>false</code> if it is not. This dummy implementation always
     *         returns <code>true</code>.
     */
    public boolean authorizePayment(Creditcard card, int amount) {
        return true;
    }
}

