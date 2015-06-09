/*Invoice Application with Enhancements
 * Author: Rakshit Kota
 * Date: 06/05/2015
 * File Description: Discount Amount Calculation Method
 */


package Invoice;

public class discountAmount {
	private double discountAmount = 0.0;
	
	public double calculateDiscountAmount(double dp, double subtotal){
		
		discountAmount = dp * subtotal;
		return discountAmount;
	}
}
//hi
