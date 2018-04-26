package entity;

import repository.Repo;

public class IBMPrice extends Repo implements Observer {
    @Override
    public void update(int id, int price) {
        this.executeUpdate("UPDATE ibm_table SET ibm_price = " + price + " WHERE microsoft_id = " + id);
    }

}
