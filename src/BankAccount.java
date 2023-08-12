public class BankAccount {
    private String accountNo;
    private String accountName;
    private double accountBalance;

    public BankAccount(String accountNo, String accountName) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.accountBalance = 0;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNo='" + accountNo + '\'' +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
