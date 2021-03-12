import java.util.Enumeration;


public class HtmlStatement extends Statement {  

   protected String rentalStringResult(Customer aCustomer) {
       return "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
   }

    
   protected String eachStringResult (Rental each, String result) {
        result += each.getMovie().getTitle()+ ": " +
        String.valueOf(each.getCharge()) + "<BR>\n";
        return result;
   }

    protected String endStringResult(String result, Customer aCustomer) {
      result += "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
      result += "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
      return result;
   }
}