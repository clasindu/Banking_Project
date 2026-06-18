import java.util.ArrayList;

public class BankAccount {

    public AccountHolder accountHolder;
    public String accountNumber;
    public String accountType;
    public int balance;
    public ArrayList<Integer> deposits = new ArrayList<>();
    public ArrayList<Integer> withdrawals = new ArrayList<>();

    public BankAccount(AccountHolder accountHolder, String accountNumber , String accountType){ //constructor
        this.accountHolder = accountHolder;
        this.accountNumber= accountNumber;
        this.accountType  = accountType;
        this.balance      =0;

    }

    public void depositCash(int amount){
        this.balance += amount;
        this.deposits.add(amount);
        System.out.println("Deposit is successful .Your balance is :" +getBalance());
    }

    public void withdrawCash(int amount){
        if(this.balance>=amount){
            this.balance -= amount;
            System.out.println("Withdraw is Successfully.You Balance is : " +getBalance());
            this.withdrawals.add(amount);
        }
        else{
            System.out.println("No sufficient Balance.Your Balance is :" +getBalance());
        }

    }

    public int getBalance(){
        return this.balance;
    }

    public double getTotalValueAfterInterestForPeriod(int period){
        if(this.accountType.equals("sa")){
            if(period >= 0){

                double totalValue = this.balance + this.balance*0.02*period;
                return totalValue;

            }else {
                System.out.println("You have enter the wrong period");
                return this.balance;
            }

        } else if (this.accountType.equals("FD")) {
            if (period < 0){
                System.out.println("You have enter the wrong period");
                return this.balance;
            }
            if(period <=2){
                double totalValue = this.balance + this.balance*0.125*period;
                return totalValue;
                
            } else if (period <=5) {
                double totalValue = this.balance + this.balance*0.165*period;
                return totalValue;
            } else if (period > 5) {
                double totalValue = this.balance + this.balance*0.2*period;
                return totalValue;
            }
        }

        return this.balance;

    }


    public void getAllWithdrawal(){
        for (int i = this.withdrawals.size() -1; i >=0 ; i--){

            System.out.println(this.withdrawals.get(i));
        }
    }


}
