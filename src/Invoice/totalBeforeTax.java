/*Invoice Application with Enhancements
 * Author: Rakshit Kota
 * Date: 06/05/2015
 * File Description: Total Before Tax Calculation Method
 */


package Invoice;

public class totalBeforeTax {
	private double totalBeforeTax = 0.0;
	
	public double calculateTotalBeforeTax (double d, double da)
	{
		totalBeforeTax = d + da;
		return totalBeforeTax;
	}
}
