package math;

/**
 * Class for representing fractions that are not reduced automatically.
 */
public class Fraction extends Number implements Cloneable {

    /**
     * The numerator of this fraction.
     */
    protected final int numerator;

    /**
     * The denominator of this fraction that is always positive.
     */
    protected final int denominator;

    /**
     * The {@code Fraction} object that represents the number zero.
     */
    public static final Fraction ZERO = new Fraction(0);

    /**
     * The {@code Fraction} object that represents the number one.
     */
    public static final Fraction ONE = new Fraction(1);

    /**
     * Constructs a {@code Fraction} object.
     *
     * @param numerator the numerator of the fraction
     * @param denominator the denominator of the fraction
     * @throws ArithmeticException if the denominator is zero
     */
    public Fraction(int numerator, int denominator) throws ArithmeticException {
        // TODO
    }

    /**
     * Constructs a {@code Fraction} object that represents the {@code int}
     * specified.
     *
     * @param n the value to be represented
     */
    public Fraction(int n) {
        // TODO
    }

    /**
     * Returns the numerator of this fraction.
     *
     * @return the numerator of this fraction
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Returns the denominator of this fraction.
     *
     * @return the denominator of this fraction
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Adds an {@code int} to this fraction.
     *
     * @param n the {@code int} to add
     * @return a fraction that represents the result
     */
    public Fraction add(int n) {
        // TODO (D0WBII)
        return null;
    }

    /**
     * Subtracts an {@code int} from this fraction.
     *
     * @param n the {@code int} to substract
     * @return a fraction that represents the result
     */
    public Fraction subtract(int n) {
        // TODO (TO0G2M)
        return null;
    }

    /**
     * Multiplies this fraction by an {@code int}.
     *
     * @param n the {@code int} to multiply by
     * @return a fraction that represents the result
     */
    public Fraction multiply(int n) {
        // TODO (IU8MVF)
        return null;
    }

    /**
     * Divides this fraction by an {@code int}.
     *
     * @param n the {@code int} to divide by
     * @return a fraction that represents the result
     * @throws ArithmeticException if the parameter {@code n} is zero
     */
    public Fraction divide(int n) throws ArithmeticException {
        // TODO (DEQW9D)
        return null;
    }

    /**
     * Raises this fraction to the power specified.
     *
     * @param n the exponent
     * @return a fraction that represents the result
     */
    public Fraction pow(int n) {
        // TODO (XB1PQD)
        return null;
    }

    /**
     * Adds a fraction to this fraction.
     *
     * @param fraction the fraction to add
     * @return a fraction that represents the result
     */
    public Fraction add(Fraction fraction) {
        // TODO (O7JA32)
        return null;
    }

    /**
     * Subtracts a fraction from this fraction.
     *
     * @param fraction the fraction to subtract
     * @return a fraction that represents the result
     */
    public Fraction subtract(Fraction fraction) {
        // TODO (B69GGA)
        return null;
    }

    /**
     * Divides this fraction by another.
     *
     * @param fraction the fraction to divide by
     * @return a fraction that represents the result
     * @throws ArithmeticException if the parameter {@code fraction} is zero
     */
    public Fraction divide(Fraction fraction) throws ArithmeticException {
        // TODO (KKXWMK)
        return null;
    }

    /**
     * Multiplies this fraction by another.
     *
     * @param fraction the fraction to multiply by
     * @return a fraction that represents the result
     */
    public Fraction multiply(Fraction fraction) {
        // TODO (NG55IV)
        return null;
    }

    /**
     * Returns the reciprocal of this fraction.
     *
     * @return a fraction that represents the reciprocal of this fraction
     */
    public Fraction reciprocal() {
        // TODO (V8PO16)
        return null;
    }

    /**
     * Returns the absolute value of this fraction.
     *
     * @return the absolute value of this fraction
     */
    public Fraction abs() {
        // TODO (L8AL1Y)
        return null;
    }

    /**
     * Returns the value of this fraction as an {@code int}.
     *
     * @return the value of this fraction as an {@code int}
     */
    public int intValue() {
        // TODO (EOJBE5)
        return 0;
    }

    /**
     * Returns the value of this fraction as a {@code double}.
     *
     * @return the value of this fraction as a {@code double}
     */
    public double doubleValue() {
        // TODO (T3Z4AP)
        return 0;
    }

    /**
     * Returns the value of this fraction as a {@code float}.
     *
     * @return the value of this fraction as a {@code float}
     */
    public float floatValue() {
        // TODO (T3Z4AP)
        return 0;
    }

    /**
     * Returns the value of this fraction as a {@code long}.
     *
     * @return the value of this fraction as a {@code long}
     */
    public long longValue() {
        // TODO (NETRJ7)
        return 0;
    }

    /**
     * Returns whether this fraction is equal to zero.
     *
     * @return {@code true} if this fraction is equal to zero, {@code false}
     * otherwise
     */
    public boolean isZero() {
        // TODO (NETRJ7)
        return false;
    }

    /**
     * Reduces this fraction.
     *
     * @return the result of the reduction of this fraction
     */
    public Fraction reduce() {
        // TODO (JUGDOZ)
        return null;
    }

    /**
     * Creates and returns a copy of this object.
     *
     * @return a clone of this object
     */
    @Override
    public Object clone() {
        // TODO (DDBUA9)
        return null;
    }

    /**
     * Compares this fraction with the specified object for equality. Two
     * {@code Fraction} objects are considered equal if and only if their
     * numerators and denominators are equal.
     *
     * @param o the object to compare to
     * @return <code>true</code> if the objects are equal, <code>false</code> otherwise
     */
    @Override
    public boolean equals(Object o) {
        // TODO (ZC6HIA)
        return false;
    }

    /**
     * Returns a hash code value for this object.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        // TODO (ZC6HIA)
        return 0;
    }

    /**
     * Returns the string representation of this object. The result is
     * <ul>
     * <li>{@code "0"} if the numerator is 0;</li>
     * <li>{@code "}<em>numerator</em>{@code "} if the denominator is 1;</li>
     * <li>{@code "}<em>numerator</em>{@code /}<em>denominator</em>{@code "} otherwise.</li>
     * </ul>
     *
     * @return the string representation of this fraction
     */
    @Override
    public String toString() {
        // TODO (BRUL3M)
        return null;
    }

}
