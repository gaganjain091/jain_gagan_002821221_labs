/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;



/**
 *
 * @author durgesh
 */
public class Accountdirectory {

  private ArrayList<Account> accountlist;

    public Accountdirectory(){
        this.accountlist = new ArrayList<Account>();
    }
    
    public ArrayList<Account> getAccountlist() {
        return accountlist;
    }

    public void setAccountlist(ArrayList<Account> accountlist) {
        this.accountlist = accountlist;
    }
    
    public Account addAccount(){
        Account account = new Account();
        accountlist.add(account);
        return account;
    }
    
    
    public void deleteAccount(Account account){
        accountlist.remove(account);
    }
    
    public Account searchaccount(String accountnumber){
        for(Account account : accountlist){
            if(account.getAccountnumber().equals(accountnumber)){
                return account;
            }
            
            }
        return null;
    }
    
    
    
}
