interface bank{


void deposite(int amount);
void withdraw(int amount);
void checkbalance();

}

class ATM implements bank{
int balance=7000;

@Override
public void deposite(int amount){
System.out.println("Depositing Rs"+amount);
balance=balance+amount;
}

@Override 
public void withdraw(int amount){
System.out.println("Withdrawing Rs"+amount);
balance-=amount;

}
@Override
public void checkbalance(){
System.out.println("Avaliable balance Rs"+balance);
}
}

public class AccountHolder{ 

public static void main(String arg[]){
bank b=new ATM();
b.checkbalance();
b.deposite(3000);
b.checkbalance();
b.withdraw(4000);
b.checkbalance();
}
}



 
