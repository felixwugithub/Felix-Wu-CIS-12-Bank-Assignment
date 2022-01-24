import java.util.Calendar;
import java.util.Date;

//tests

public class Main {
    public static void main(String[] args) {

        //tests on overdraft checking & withdrawals

        Date date = Calendar.getInstance().getTime();

        Customer c1 = new Customer("John Cena", 3219813, 0.00, 0.00);
        c1.withdraw(100.0, date, Customer.CHEQUING);
        c1.withdraw(0.01, date, Customer.CHEQUING);
        c1.withdraw(100.0, date, Customer.SAVING);
        c1.withdraw(0.01, date, Customer.SAVING);

        c1.displayBalance(Customer.CHEQUING);   //expected output: -100.00
        c1.displayBalance(Customer.SAVING);     //expected output: -100.00    (negative balance after overdrafting)
        c1.withdraw(0.01, date, Customer.CHEQUING); //expected output: none, since maximum overdraft has been used up

        c1.displayWithdraws();


        //tests on deposits and initializing a customer object with initial deposits
        Customer c2 = new Customer("John Xina", 1828318, 0.30, 0.12);
        c2.displayBalance(Customer.CHEQUING); //expected output: 0.30
        c2.displayBalance(Customer.SAVING);   //expected output: 0.12
        c2.deposit(1231,date, Customer.SAVING );
        c2.deposit(1231,date, Customer.CHEQUING );
        c2.displayDeposits();
        c2.displayWithdraws();
        c2.displayBalance(Customer.CHEQUING); //expected output: 1231.30
        c2.displayBalance(Customer.SAVING);   //expected output: 1231.12


    }

}
