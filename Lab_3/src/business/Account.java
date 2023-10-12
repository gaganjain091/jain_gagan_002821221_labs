/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.Date;

/**
 *
 * @author durgesh
 */
public class Account {
    private String routingnumber;
    private String accountnumber;
    private String bankname;
    private int balance;
    private Date createdon;

    public String getRoutingnumber() {
        return routingnumber;
    }

    public void setRoutingnumber(String routingnumber) {
        this.routingnumber = routingnumber;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }
    
    @Override
    public String toString(){
        return bankname;
    }
    
    
}
