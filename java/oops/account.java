package oops;

public class account {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "sarthak mishra ";
        myAcc.setPasword("123456");

    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPasword(String pwd) {
        password = pwd;

    }
}
