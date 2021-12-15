import java.util.Date;

public class Withdraw{

    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account.toUpperCase();
    }

    public String toString(){
        String output = "";
        output = "Withdrawal of: " + amount + " | Date: " + date + " | Account: " + account;
        return output;
    }

}
