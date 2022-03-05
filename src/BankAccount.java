import java.sql.SQLOutput;
import java.util.*;
public class BankAccount {
    private double bankAmount;  // every bank account has an amount of money stored in it
    private String bankAccountName;  // every bank account has a name
    private String bankPassword;  // every bank account has a password

    // how do you make a new bank account?

    // when you make a new bank account, start w/ initial values

    // this. when referring to instances

    public BankAccount(String name, double startAmount) {
        this.bankAccountName = name;
        this.bankAmount = startAmount;
        this.bankPassword = "";
    }


    // what methods can we call on an instance on bankAccount? what do you want to do with your bank account as a customer

    /* method = withdraw tries to take money out of the account, make sure there is sufficient finds aka bank amount >= withdrawal
    returns whether or not withdrawal is successful
     */

    public boolean withdraw(double amountWithdraw, BankAccount other) {

        if(amountWithdraw > this.bankAmount) {
            return false;
        }
        this.bankAmount -= amountWithdraw;
        return true;
    }


    /* puts money into bank account
     */

    public void deposit(double depositAmount) {
        this.bankAmount += depositAmount;
    }

    // checks the amount of money currently in your bank account

    public double checkBalance() {

        return this.bankAmount;
    }



    public void setPassword(String newPassword) {

       this.bankPassword = newPassword;
        }

    public boolean checkPassword(String possiblePassword) {
        return this.bankPassword.equals(possiblePassword);
    }

    // TODO transfer from 1 bank account to another
    public boolean transfer(BankAccount other, double transferAmount) {

            if (transferAmount <= this.bankAmount) {
                this.bankAmount -= transferAmount;
                other.bankAmount += transferAmount;
                return true;
            }
         return false;

    }
    public String toString() {
        String one = "";
        String dollarFormat = String.format("%10.2f", this.bankAmount).trim();
        one = this.bankAccountName+": $"+dollarFormat;
        return one;

    }

    public static void main(String[] args) {
        BankAccount georgeAccount = new BankAccount("George's Account", 500);
        BankAccount joeAccount = new BankAccount("Joe's Account", 1000);
        BankAccount bobAccount = new BankAccount("Bob's Account", 500);
        System.out.println(georgeAccount.checkBalance());
        System.out.println(joeAccount.checkBalance());
        System.out.println(bobAccount.checkBalance());
        System.out.println(georgeAccount);
        System.out.println(joeAccount);
        System.out.println(bobAccount);
        georgeAccount.setPassword("123George");
        bobAccount.setPassword("BobIsAwesome!");
        System.out.println(georgeAccount.checkPassword("123George"));
        System.out.println(bobAccount.checkPassword("BobIsAwesone!"));
        joeAccount.deposit(500);
        joeAccount.transfer(bobAccount,300.5);
        System.out.println(joeAccount);
        System.out.println(bobAccount);

        //TODO check password before withdraw, deposit, transfer, etc.
    }
    }

