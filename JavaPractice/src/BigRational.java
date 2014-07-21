import acm.util.*;
import java.math.*;

/**
 * The Rational class is used to represent rational numbers, which
 * are defined to be the quotient of two integers.
 */
public class BigRational {

/**
 * Creates a new Rational initialized to zero.
 */
	public BigRational() {
		this(0);
	}
	
/**
 * Creates a new Rational from the integer argument.
 * @param n The initial value
 */
	public BigRational(int n) {
		this(n, 1);
	}
	
/**
 * Creates a new Rational with the value x / y.
 * @param x The numerator of the rational number
 * @param y The denominator of the rational number
 */
	public BigRational(int x, int y) {
		if (y == 0) throw new ErrorException("Division by 0");
		int g = gcd(Math.abs(x), Math.abs(y));
		num = BigInteger.valueOf(x).divide(BigInteger.valueOf(g));
		den = BigInteger.valueOf(Math.abs(y)).divide(BigInteger.valueOf(g));
		if (y < 0) num.negate();
	}
	
/**
 * Adds the rational number r to this one and returns the sum.
 * @param r The rational number to be added
 * @return The sum of the current number and r
 */
	public BigRational add(BigRational r) {
		return new BigRational(this.num.multiply(r.den).add(r.num.multiply(this.den)).intValue(),
							this.den.multiply(r.den).intValue());
	}
	
/**
 * Subtracts the rational number r from this one.
 * @param r The rational number to be subtracted
 * @return The result of subtracting r from the current number
 */
	public BigRational subtract(BigRational r) {
		return new BigRational (this.num .multiply( r.den ).subtract ( r.num .multiply( this.den)).intValue(),
                this.den .multiply( r.den).intValue());
	}
	
/**
 * Multiplies this number by the rational number r.
 * @param r The rational number used as a multiplier
 * @return The result of multiplying the current number by r
 */
	public BigRational multiply(BigRational r) {
		return new BigRational (this.num .multiply( r.num ).intValue(),
                this.den .multiply( r.den).intValue());
	}
	
/**
 * Divides this number by the rational number r.
 * @param r The rational number used as a divisor
 * @return The result of dividing the curret number by r
 */
	public BigRational divide(BigRational r) {
		return new BigRational (this.num .multiply( r.den ).intValue(),
                this.den .multiply( r.num).intValue());
	}
	
/**
 * Creates a string representation of this rational number.
 * @return The string representation of this rational number
 */
	public String toString() {
		if (den.equals(new BigInteger ("1"))) {
			return "" + num;
		} else {
			return num + "/" + den;
		}
	}
	
/**
 * Calculates the greatest common divisor using Euclid's algorithm.
 * @param x First integer
 * @param y Second integer
 * @return The greatest common divisor of x and y
 */
	private int gcd(int x, int y) {
		int r = x % y;
		while (r != 0) {
			x = y;
			y = r;
			r = x % y;
		}
		return y;
	}
	
// Private instance variables
	
	private BigInteger num; // The numerator of this Rational
	private BigInteger den; // The denominator of this Rational
}