import java.util.Date;
import java.util.Locale;

public class Deposit {

    private double amount;
    private Date date;
    private String account;

    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account.toUpperCase();
    }

    public String toString() {
        String output = "";
        output = "Deposit of: " + amount + " | Date: " + date + " | Account: " + account;
        return output;
    }


}
