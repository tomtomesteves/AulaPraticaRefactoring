import java.util.Enumeration;


public class TextStatement extends Statement {

   protected String rentalStringResult(Customer aCustomer) {
       return "Rental Record for " + aCustomer.getName() +
      "\n";
   }

   protected String eachStringResult(Rental each, String result) {
        result +=  "\t" + each.getMovie().getTitle()+ "\t" +
        String.valueOf(each.getCharge()) + "\n";
        return result;
   }

   protected String endStringResult(String result, Customer aCustomer) {
      result += "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n";
      result += "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
      return result;
   }
}