package Account;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance<0) this.balance=0;
        this.balance = balance;
    }
    public void paraEkle(double eklenecekTutar){
        if (eklenecekTutar>0){
            balance=balance+eklenecekTutar;
        }
    }







}
