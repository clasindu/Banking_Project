public class BankAccount {

    public String name;
    public String birthday;
    public String address;
    public String accountNumber;
    public String accountType;
    public int balance;

    public BankAccount(String name , String birthday ,String address, String accountNumber , String accountType){ //constructor
        this.name        =  name;
        this.birthday    =  birthday;
        this.address     =  address;
        this.accountNumber= accountNumber;
        this.accountType  = accountType;
        this.balance      =0;

    }
}
