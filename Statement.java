import java.util.Enumeration;

public abstract class Statement {

    abstract String rentalStringResult(Customer aCustomer);
    abstract String eachStringResult(Rental each, String result);
    abstract String endStringResult(String result, Customer aCustomer);

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
    
}