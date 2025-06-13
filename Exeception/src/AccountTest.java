public class AccountTest {
    public static void main(String[] args) {
        Account account=new Account(23,"Samiullah",1000);
        try{
            account.withdraw(2000);
        }catch (InvalidAmountException invalidAmountException){
            System.out.println(invalidAmountException.getMessage());
        }catch (InsufficientBalanceException exp){
            System.out.println("User id:\t"+exp.getId());
            System.out.println(exp.getMessage());
        }
        System.out.println(account.getBalance());
    }
}
