import java.util.Enumeration;


public class HtmlStatement extends Statement {
   
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
       return "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
   }

   private String eachStringResult (Rental each, String result) {
        result += each.getMovie().getTitle()+ ": " +
        String.valueOf(each.getCharge()) + "<BR>\n";
        return result;
   }

    private String endStringResult(String result, Customer aCustomer) {
      result += "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
      result += "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
      return result;
   }
}