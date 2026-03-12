package ObserverPattern.Observers;

import ObserverPattern.Observables.Observable;

public class EmailObserverImpl implements Observer {
    String email;
    Observable o;
    public EmailObserverImpl(String email, Observable o){
        this.o=o;
        this.email=email;
    }
    public void update() {
        int data = o.getData();
        sendMail(email,data);
    }
    public void sendMail(String email,int data){
        System.out.println("Email sent to "+email+" with the data "+data);
    }
}
