/*Invoice Application with Enhancements
 * Author: Rakshit Kota
 * Date: 06/05/2015
 * File Description: Discount Percent Calculation Method
 */


package Invoice;

public  class  discountPercent {
	private double discountPercent = 0.0;
	public double calculateDiscountPercent(double subtotal)
	{
		  if (subtotal >= 500)
          {
              discountPercent = .25;
              assert subtotal >= 500 : "If condition not responding right";
            
          }
          else 
          {
          	if ((subtotal >= 200) && (subtotal < 500))
          	{
          		discountPercent = 0.2;
          		
          	}
          	else if (subtotal >= 100)
          	{
          		discountPercent = .1;
          		
          	}
          	else
          	{
          		discountPercent = 0.0;
          		
          	}
          }
		return discountPercent;
	}
}
