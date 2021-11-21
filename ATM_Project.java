package com.bank;
import java.util.*;

class bank {
int accbal=90000, dep, wthd, trans, intrt, info, exit, currbal,fee=20;

public int accountbalance() {
return accbal ;
}

public int cashdeposit() {
accbal = accbal + dep;
return dep;

}

public int cashwithdraw() {
if (wthd<=accountbalance()) {
accbal = accbal - wthd- fee;
System.out.println(" You withdraw(withdraw charges -20rs applied) " + wthd + " and Your Current balance is now: "+accountbalance());
}
else
{
System.out.println("Sorry! There is Insufficient Balance in your Account ");
}
return wthd;
}

public int cashtransfer() {
if (trans<=accountbalance()) {
accbal = accbal - trans- fee;
}
else
{
System.out.println("Sorry! There is Insufficient Balance in your Account ");
}
return trans;
}

public int interestrate() {
intrt = (intrt * accountbalance()) / 100;
return intrt;
}

public void accountinfo() {
System.out.println("""
USER CNIC: 4211111111111
USER CONTACT: 03111111111
USER EMAIL ADDRESS: xyz@gmail.com
USER ADDRESS: SHADMAN TOWN , NORTH NAZIMABAD
""");
}

}
public class Main
{
public static void main(String[] args) {
System.out.println("-=-=-=-=-=-=-=-=-=-=- BANKINNG SYSTEM -=-=-=-=-=-=-=-=-=-=-=-");
Scanner s = new Scanner(System.in);
bank bk = new bank();
int opt, a, b, c, d, e, i=0, g,v,r;
String username, password;
while (true) {
System.out.println("Enter Your Account Username: ");
username = s.nextLine();

System.out.println("Enter Your Account Password: ");
password = s.nextLine();

if (username.equals("abid") && password.equals("abid123")) {
while (true) {
System.out.println("""
\n\n
1- ACCOUNT BALANCE
2- CASH DEPOSIT
3- CASH WITHDRAW
4- CASH TRANSFER
5- INTEREST RATE
6- ACCOUNT INFO
7- EXIT
""");
System.out.println("Select any Option: ");
opt = s.nextInt();

switch (opt) {

case 1:
System.out.println("-=-=-=-=-=-=-=-=-=-=- ACCOUNT BALANCE -=-=-=-=-=-=-=-=-=-=-=-\n\n");
a = bk.accountbalance();
System.out.println("Your Balance Amount is: " + a);

break;
case 2:
System.out.println("-=-=-=-=-=-=-=-=-=-=- CASH DEPOSIT -=-=-=-=-=-=-=-=-=-=-=-\n\n");
System.out.println("Enter the Deposit Amount");
bk.dep = s.nextInt();
b = bk.cashdeposit();
System.out.println(" You deposit Rs: " + b + " and Your Current balance is now: " + bk.accountbalance());
break;
case 3:
System.out.println("-=-=-=-=-=-=-=-=-=-=- CASH WITHDRAW -=-=-=-=-=-=-=-=-=-=-=-\n\n");
System.out.println("Enter the Withdraw Amount");
bk.wthd = s.nextInt();
bk.cashwithdraw();
break;
case 4:
System.out.println("-=-=-=-=-=-=-=-=-=-=- CASH TRANSFER -=-=-=-=-=-=-=-=-=-=-=-\n\n");
System.out.println("Enter the Transfer Account Number: ");
g = s.nextInt();
System.out.println("Enter the Transfer Amount");
bk.trans = s.nextInt();
d = bk.cashtransfer();
System.out.println(" You Transfered (transfer charges -20rs applied) Rs: " + d + " into Account No: " + g + " and Your Current balance is now: " + bk.accountbalance());
break;
case 5:
System.out.println("-=-=-=-=-=-=-=-=-=-=- CHECK INTEREST -=-=-=-=-=-=-=-=-=-=-=-\n\n");
System.out.println("Enter the Interest rate ");
c = s.nextInt();
bk.intrt = c;
v=bk.interestrate();
r= bk.accbal-bk.intrt;
System.out.println("Amount after applying " + c + "% interest which is Rs: "+v+ " so your remaining balance is Rs: "+r);
break;
case 6:
System.out.println(" =-=-=-=-=-=-=-=-=-=- YOUR ACCOUNT INFO -=-=-=-=-=-=-=-=-=-=-\n\n");
System.out.println("ACCOUNT USERNAME: " + username);
System.out.println("ACCOUNT PASSWORD: " + password);
System.out.println("USER CURRENT ACCOUNT BALANCE: " + password);
bk.accountinfo();
break;
case 7:
System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=- EXITED -=-=-=-=-=-=-=-=-=-=-=-");
System.exit(i);
}
}
}
else {
System.out.println("\n****Your Username Or Password is Incorrect, Try Again. ****\n\n");
}
}
}
}