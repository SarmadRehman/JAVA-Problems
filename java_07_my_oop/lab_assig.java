package java_07;



import java.util.*;

class Account
{
        String accountName;
        double init_balance;
        long acc_number;
        private static int numAccounts ;
        public Account(double initBal, String owner, long number)
        {
                init_balance = initBal;
                accountName = owner;
                acc_number = number;
                numAccounts ++;
        }
        public Account(double initBal, String owner)
        {
                Random ran_num = new Random();
                acc_number = ran_num.nextInt(2000);
                init_balance = initBal;
                accountName = owner;
                ++numAccounts;
        }
        public Account(String owner)
        {
                accountName = owner;
                ++numAccounts;
        }

        public void withdraw(double amount, double tax)
        {
                if(init_balance >= amount)
                {
                        init_balance -= amount;
                        init_balance -= tax;
                }
                else
                        System.out.println("Not enough money in the account");
        }
        public void withdraw(double amount)
        {
                if(init_balance >= amount){
                        init_balance -= amount;}
                else{
                        System.out.println("Not enough money in the account");}
        }
        public void deposit(double amount)
        {
                if(amount <= 0){
                        System.out.println("Invalid Amount!");}
                else{
                        init_balance += amount;}
        }
        public void close()
        {
                String temp = accountName;
                init_balance = 0;
                accountName = "This account is closed";
                --numAccounts;
        }
        public static Account consolidate(Account acct1, Account acct2)
        {
                Account newAccount = null;
                if(acct1.acc_number != acct2.acc_number && acct1.accountName == acct2.accountName)
                {
                        double total_balance = acct1.init_balance + acct2.init_balance;
                        newAccount = new Account(total_balance, acct2.accountName);
                        acct1.close();
                        acct2.close();
                        return newAccount;
                }
                else if(acct1.acc_number == acct2.acc_number)
                {
                        System.out.println("Consolidation is not possible, because account number are same");
                }
                else if(!(acct1.accountName.equals(acct2.accountName)))
                        {
                                System.out.println("Consolidation is not possible, because the name of account " +
                                        "if different");
                        }
                return null;
        }
        public void toStrings()
        {
                System.out.println("Name: " + accountName);
                System.out.println("Account Number: " + acc_number);
                System.out.println("Balance: " + init_balance);
        }
        public static void TotalAccount(){
                System.out.println("Total number of accounts : " + numAccounts );
        }
        public static int getNumAccounts()
        {
                return numAccounts;
        }
}
public class lab_assig
{
        public static void main(String[] args)
        {
                String[] names = {"Qasim", "Ahmad", "Ahmad"};
                double[] amount = {100.0, 100.0, 100.0};
                ArrayList<Account> accountList = new ArrayList<Account>();
                int i = 0;
                while(i < names.length)
                {
                        accountList.add(new Account(amount[i], names[i]));
                        ++i;
                }
                i = 0;
                while(i < accountList.size())
                {
                        accountList.get(i).toStrings();
                        ++i;
                }
                accountList.get(0).close();
                Account temp = Account.consolidate(accountList.get(1), accountList.get(2));
                accountList.add(temp);
                i = 0;
                while(i < accountList.size())
                {
                        accountList.get(i).toStrings();
                        ++i;
                }
        }
}