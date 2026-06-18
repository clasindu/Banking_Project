public class Main {

    public static void main(String[] args){

        AccountHolder jane =new AccountHolder("Jane Anderson", "06/05/1998" ,"Colombo");
//        System.out.println(jane.name);
//        System.out.println(jane.address);

        BankAccount lasiBankAccount = new BankAccount("Chamath Lasindu","30/05/2000" ,"Newtown,Ratnapura" ,"2933839389", "sa");
        lasiBankAccount.depositCash(500);
        lasiBankAccount.withdrawCash(400);

        System.out.println(lasiBankAccount.getBalance());





    }
}
