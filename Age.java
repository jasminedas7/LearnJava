import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Age {
   public static void main(String[] args) {
       //getting current date and time using Date class
       DateFormat df = new SimpleDateFormat("dd/MM/yy");
       Date dateobj = new Date();
       System.out.println(df.format(dateobj));

       /*getting current date time using calendar class 
        * An Alternative of above*/
       Calendar calobj = Calendar.getInstance();

       
       
    }
}