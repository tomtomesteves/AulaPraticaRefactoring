import java.util.Enumeration;


public class TextStatement extends Statement {
    
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = rentalStringResult(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         result = eachStringResult(each, result);
      }
      result = endStringResult(result, aCustomer);
      return result;
   }

   private String rentalStringResult(Customer aCustomer) {
       return "Rental Record for " + aCustomer.getName() +
      "\n";
   }

   private String eachStringResult(Rental each, String result) {
        result +=  "\t" + each.getMovie().getTitle()+ "\t" +
        String.valueOf(each.getCharge()) + "\n";
        return result;
   }

   private String endStringResult(String result, Customer aCustomer) {
      result += "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n";
      result += "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
      return result;
   }
}