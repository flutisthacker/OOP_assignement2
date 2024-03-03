package E;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name){
        this.id=id;
        this.name=name;
    }
    public Account(String id, String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public String getId() {
        return id;
    }
    public int getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }

    public int credit(int amount){
        this.balance+= amount;
        return this.balance;
    }
    public int debit(int amount){
        if (amount<=balance){
            this.balance-=amount;
            return this.balance;
        }else{
            System.out.println("amount exceeded");
            return this.balance;
        }
    }

    public int transferTo(Account another, int amount){
        if (amount<=balance){
            another.balance+=amount;
            return this.balance;
        }else{
            System.out.println("amount exceeded");
            return this.balance;
        }
    }
    @Override
    public String toString() {
      return "Account[" +
          "id=" + id +
          "name=" + name +
          ", balance=" + balance + '\'' +
          ']';
    }
}
