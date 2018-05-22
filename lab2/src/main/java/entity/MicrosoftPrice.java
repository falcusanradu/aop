package entity;

import repository.Repo;

public class MicrosoftPrice extends Repo implements Observer{
    @Override
    public void update(int id ,int price) {
        this.executeUpdate("UPDATE microsoft_table SET microsoft_price = " + price + " WHERE microsoft_id = " + id);
    }
}
