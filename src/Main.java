public class Main {

    public static void main(String[] args){

        AccountHolder jane =new AccountHolder("Jane Anderson", "06/05/1998" ,"Colombo");
        System.out.println(jane.name);
        System.out.println(jane.address);

        BankAccount lasi = new BankAccount("Chamath Lasindu","30/05/2000" ,"Newtown,Ratnapura" ,"2933839389", "sv");
        System.out.println(lasi.name);
        System.out.println(lasi.accountNumber);

    }
}
