public class Main {

    public static void main(String[] args){

        AccountHolder lasi =new AccountHolder("Chamath Lasindu", "30/05/2000" ,"Newtown,Ratnapura");
        AccountHolder marry = new AccountHolder("Mary Johnson", "21/23/2000" ,"Newyork" );
//        System.out.println(jane.name);
//        System.out.println(jane.address);

        BankAccount lasiBankAccount = new BankAccount(lasi,"323244232" , "sa");
        BankAccount lasiBankAccount2 = new BankAccount(lasi, "4434355454" ,"FD");
        BankAccount marryBankAccount = new BankAccount(marry,"232434355" ,"sa");

        System.out.println(marryBankAccount.accountHolder.name);
        System.out.println(lasiBankAccount.accountHolder.address);
        System.out.println(marryBankAccount.accountHolder.birthday);
        System.out.println(lasiBankAccount.accountHolder.birthday);

        lasiBankAccount.depositCash(1400);
        lasiBankAccount.withdrawCash(400);
//
//        System.out.println(lasiBankAccount.getBalance());
//        System.out.println(lasiBankAccount.getTotalValueAfterInterestForPeriod(-7));
//        lasiBankAccount2.depositCash(2000);
//        lasiBankAccount2.withdrawCash(500);
//        System.out.println(lasiBankAccount2.getTotalValueAfterInterestForPeriod(4));
//
//
//
        lasiBankAccount.withdrawCash(200);
        lasiBankAccount.withdrawCash(100);


    }
}
