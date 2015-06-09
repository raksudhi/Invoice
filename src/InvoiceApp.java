/*Invoice Application with Enhancements
 * Author: Rakshit Kota
 * Date: 06/05/2015
 * File Name: Main 
 */



import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import YESORNO.yesorno;
//import Exception.yesorno;
import Invoice.*;
public class InvoiceApp
{
	
    public static void main(String[] args)
    {
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line
        //discountPercent.print();
        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);
        double discountamount = 0.0;
        double discount = 0.0;
        double total = 0.0;
        int count = 0;
        double discountpercent= 0.0;
        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y"; 
  
        do
        {
        	
	        	if(choice.equalsIgnoreCase("y"))
	        	{
	        		if((total >=0) && (total <10000.00))
	        		{
	            // get the invoice subtotal from the user
			            System.out.print("Enter subtotal:   ");
			            double subtotal = sc.nextDouble();
			            
			            // calculate the discount amount and total
			            discountPercent dp = new  discountPercent();
			            discountpercent =  dp.calculateDiscountPercent(subtotal);
			           
			            discountAmount da =  new  discountAmount();
			            discountamount =  da.calculateDiscountAmount(discountpercent, subtotal);
			            
			            totalBeforeTax d = new  totalBeforeTax();
			            discount = d.calculateTotalBeforeTax(discount, discountamount);
			           
			            totalAfterTax t = new totalAfterTax();
			            total = t.calculateTotalAfterTax(total, subtotal, discountamount);
			            count++;
			            //total = total + (subtotal - discountamount);
			
		        	}
	        	
		        	 System.out.print("Continue? (y/n): ");
		        	 choice = sc.next();
	        		try
	        		{ // see if the user wants to continue
			           
	        			 
			            if(!((choice.equalsIgnoreCase("y")) || (choice.equalsIgnoreCase("n"))))
			            	throw new yesorno();
			            
				     
	        		}
	        		catch(yesorno ex)
	            	{
	            		System.out.println(ex.getMessage());
	            		 choice = sc.next();
	            	}
		          //  System.out.println(total);
	        		
	        	}
	        	
        }while (!choice.equalsIgnoreCase("n"));
        // display the discount amount and total
     
	        NumberFormat nf = NumberFormat.getCurrencyInstance();
	        String message = //"Discount percent: " + discountPercent + "\n"
	                "Discount amount:  " + nf.format(discount / count) + "\n"
	                + "Invoice total:    " +  nf.format(total/count) + "\n"
	        		+ "Number of Invoices: " + count + "\n";
	        		System.out.println(message);
       
    }
}