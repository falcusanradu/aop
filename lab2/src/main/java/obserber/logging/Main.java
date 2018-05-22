package obserber.logging;

import entity.IBMPrice;
import entity.MicrosoftPrice;
import entity.ObservableOrSubject;

public class Main {

    public static void main(String[] args) {

        ObservableOrSubject observableOrSubject = new ObservableOrSubject();
        IBMPrice ibmPrice = new IBMPrice();
        MicrosoftPrice microsoftPrice = new MicrosoftPrice();

        observableOrSubject.update(microsoftPrice,1,25 );

    }
}
