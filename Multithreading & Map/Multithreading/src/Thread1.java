import java.lang.System.Logger;
import java.lang.System.Logger.Level;



public class Thread1 extends Thread implements Runnable {

private Person person;

public Thread1(Person p) {
    this.person = p;
}

public static void main(String[] args) {

	Thread1 ts1 = new Thread1(new Person("person 1"));
    ts1.start();
    Thread1 ts2 = new Thread1(new Person("person 2"));
    ts2.start();
    Thread1 ts3 = new Thread1(new Person("person 3"));
    ts3.start();

}

@Override
public void run() {
    for (int i = 0; i < 3; i++) {
        try {
        	MultiThreading acc = MultiThreading.getAccount(person);
            acc.withdraw(100);
            
            if (acc.getBal() < 0) {
                System.out.println("account is overdrawn!");
            }
            acc.deposit(200);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    System.out.println("Final Acc balance is Rs." + MultiThreading.getBal());
}}
