import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Customer {

    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double chequingBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHEQUING = "CHEQUING";
    public static final String SAVING = "SAVING";
    private final int OVERDRAFT = -100;

    Customer(){
        name = "";
        deposits = new ArrayList<Deposit>();
        //create default constructor
    }
    Customer(String name, int accountNumber, double chequingDeposit, double savingDeposit){
        deposits = new ArrayList<Deposit>();
        withdraws = new ArrayList<Withdraw>();
        this.name = name;
        this.accountNumber = accountNumber;

        if(chequingDeposit > 0){

        Deposit deposit = new Deposit(chequingDeposit, Calendar.getInstance().getTime() , "CHEQUING");
        deposits.add(deposit);}

        if(savingDeposit > 0){
        Deposit deposit2 = new Deposit(savingDeposit, Calendar.getInstance().getTime() , "SAVING");
        deposits.add(deposit2);}

        this.chequingBalance += chequingDeposit;
        this.savingBalance += savingDeposit;
    }

    public double deposit(double amt, Date date, String account){
        Deposit deposit = new Deposit(amt, date, account);
        deposits.add(deposit);

        if(account.toUpperCase().equals(CHEQUING)){
            chequingBalance+=amt;
        }else if(account.toUpperCase().equals(SAVING)){
            savingBalance+=amt;
        }

        return 0;
    }
    public double withdraw(double amt, Date date, String account){
        if(!checkOverdraft(amt, account)){
            Withdraw withdraw = new Withdraw(amt, date, account);
            withdraws.add(withdraw);

            if(account.toUpperCase().equals(CHEQUING)){
                chequingBalance-=amt;
            }else if(account.toUpperCase().equals(SAVING)){
                savingBalance-=amt;
            }
        }else{
            return -1;
        }
        return 0;
    }


    private boolean checkOverdraft(double amt, String account){

        if(account.equals(CHEQUING)){
            if (amt > chequingBalance){
                return true;
            }
        }
        if(account.equals(SAVING)){
            if(amt > savingBalance){
                return true;
            }
        }

        return false;
    }



    //-------------------------------//
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }

    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }
}
