/** Adam Allard
 * chapter 4 PC 4. Software Sales
 * this class calculates and returns the total cost of purchases for 
 * a company. the company offers a quantity discount (input from the user)
 *  which is reflected in the total cost
 */

package ch4;

public class SoftwareSales {
	// fields
   private int unitsSold;
   private double packageRetail = 99.00;
   private double totalCost;
   private double discount;
   
   // constructor
   public SoftwareSales(int units) {
	   unitsSold = units;
	   
	   setDiscount();
   }
   
   // setters
   public void setUnitsSold(int units) {
	   unitsSold = units;
   }
   
   public void setDiscount() {
	   if (unitsSold >= 10 && unitsSold <= 19)
		   discount = .2 * packageRetail;
	   else if (unitsSold >= 20 && unitsSold <= 49)
		   discount = .3 * packageRetail;
	   else if (unitsSold >= 50 && unitsSold <= 99)
		   discount = .4 * packageRetail;
	   else if (unitsSold >= 100)
		   discount = .5 * packageRetail;
	   
	   discount *= unitsSold;
	   setCost();
   }
   
   public void setCost() {
	   totalCost = unitsSold * packageRetail - discount;
   }
   
   // getters
   public int getUnitsSold(){
	   return unitsSold;
   }
   
   public double getDiscount() {
	   return discount;
   }
   
   public double getCost() {
	   return totalCost;
   }
}
