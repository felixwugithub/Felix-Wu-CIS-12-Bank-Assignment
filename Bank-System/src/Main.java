import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("John Cena", 3219813, 491.39, 39990.99);

        c1.withdraw(999, Calendar.getInstance().getTime(), Customer.SAVING);
        c1.displayWithdraws();
    }

}
