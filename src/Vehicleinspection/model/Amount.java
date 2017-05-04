package Vehicleinspection.model;

/**
 * Represents an amount of money
 */
public final class Amount {
    private final int amount;

    /**
     * Creates a new instance, representing the amount 0.
     */
    public Amount() {
        this(0);
    }

    /**
     * Creates a new instance, representing the specified amount.
     *
     * @param amount The amount represented by the newly created instance.
     */
    public Amount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return Integer.toString(amount);
    }
}

