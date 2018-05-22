package entity;

public class ObservableOrSubject {

    public void update(Observer observer, int id, int price) {
        observer.update(id, price);
    }

}
