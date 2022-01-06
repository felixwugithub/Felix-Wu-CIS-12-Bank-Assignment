import java.util.Calendar;
import java.util.Date;

//tests

public class Main {
    public static void main(String[] args) {



        Customer c1 = new Customer("John Cena", 3219813, 0.00, 0.00);
        c1.withdraw(100.0, Calendar.getInstance().getTime(), Customer.CHEQUING);
        c1.withdraw(0.01, Calendar.getInstance().getTime(), Customer.CHEQUING);
        c1.withdraw(100.0, Calendar.getInstance().getTime(), Customer.SAVING);
        c1.withdraw(0.01, Calendar.getInstance().getTime(), Customer.SAVING);
        c1.displayWithdraws();
        c1.displayBalance(Customer.CHEQUING);
        c1.displayBalance(Customer.SAVING);

        Customer c2 = new Customer("John Xina", 1828318, 0.30, 0.12);
        c2.displayBalance(Customer.CHEQUING);
        c2.displayBalance(Customer.SAVING);
        c2.deposit(1231,Calendar.getInstance().getTime(), Customer.SAVING );
        c2.deposit(1231,Calendar.getInstance().getTime(), Customer.CHEQUING );
        c2.displayDeposits();
        c2.displayWithdraws();
        c2.displayBalance(Customer.CHEQUING);
        c2.displayBalance(Customer.SAVING);


    }

}
