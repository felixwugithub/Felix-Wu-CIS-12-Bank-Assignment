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


    /*
    requires the object to be initialized (obviously) with amount, date, acount
    prints the withdrawn amount, the date of withdrawal, and the account affected.

    does not take inputs
    does not modify

     */


    public String toString(){
        String output = "";
        output = "Withdrawal of: " + amount + " | Date: " + date + " | Account: " + account;
        return output;
    }

}
