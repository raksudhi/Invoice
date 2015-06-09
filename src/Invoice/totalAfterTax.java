/*Invoice Application with Enhancements
 * Author: Rakshit Kota
 * Date: 06/05/2015
 * File Description: Total after Sales Tax Method
 */


package Invoice;

public class totalAfterTax {
	private double totalAfterTax = 0.0;
	
	public double calculateTotalAfterTax(double t, double s, double da)
	{
		totalAfterTax = t + (s - da);
		return totalAfterTax;
	}
}
