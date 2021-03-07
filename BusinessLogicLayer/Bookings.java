package BusinessLogicLayer;

public class Bookings{
    private String BookingID;
    private String BookingDate;
    private String BookingPrice;
    private String BookingDiscount;
    private String BookingConfirmation;

    public Bookings(String BookingID, String BookingType, String BookingDate, String BookingPrice,
            String BookingDiscount, String BookingConfirmation) {

        this.BookingID = BookingID;
        this.BookingDate = BookingDate;
        this.BookingPrice = BookingPrice;
        this.BookingDiscount = BookingDiscount;
        this.BookingConfirmation = BookingConfirmation;
    }

    public void setBookingID(String BookingID) {
        this.BookingID = BookingID;
    }

    public String getBookingID() {
        return BookingID;
    }

    public void setBookingType(String BookingType) {
       }
       public String getBookingDate() {
        return BookingDate;
       }
       public void setBookingDate(String BookingDate) {
        this.BookingDate = BookingDate;
       }
       public String getBookingPrice() {
          return BookingPrice;
         }
         public void setBookingPrice(String BookingPrice) {
          this.BookingPrice = BookingPrice;
         }
         public String getBookingDiscount() {
          return BookingDiscount;
         }
         public void setBookingDiscount(String BookingDiscount) {
          this.BookingDiscount = BookingDiscount;
         }
         public String getBookingConfirmation() {
            return BookingConfirmation;
           }
           public void setBookingConfirmation(String BookingConfirmation) {
            this.BookingConfirmation = BookingConfirmation;
           }
      public List<String>GetBookingInfo(BookingID,BookingType,BookingDate,BookingPrice)
        {
            List<String>GetBookingInfo = new ArrayList<String>();
            GetBookingInfo.add("BO0012");
            GetBookingInfo.add("Wedding");
            GetBookingInfo.add("21March2021");
            GetBookingInfo.add("R20000");
           return GetBookingInfo;
        }
}
