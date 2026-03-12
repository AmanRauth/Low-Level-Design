package ObserverPattern.Observers;

import ObserverPattern.Observables.Observable;

public class MobileObserverImpl implements Observer{
    String mobileNumber;
    Observable o;
    public MobileObserverImpl(String mobileNumber, Observable o){
        this.o=o;
        this.mobileNumber=mobileNumber;
    }
    public void update() {
        int data = o.getData();
        sendMobileMssg(mobileNumber,data);
    }
    public void sendMobileMssg(String mobileNumber,int data){
        System.out.println("Mobile mssg sent to "+mobileNumber+" with the data "+data);
    }
}
