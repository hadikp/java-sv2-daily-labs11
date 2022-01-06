package day04;

import java.util.List;

public class User {

    private String userName;
    private int money;
    private List<Item> purchasedItems; //vásárolt elemek

    public void shopping(Item item) {
        if (item.getPrice() < money) {
            purchasedItems.add(item);
        }
    }

    public User(String userName, int money) {
        this.userName = userName;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public int getMoney() {
        return money;
    }

    public List<Item> getPurchasedItems() {
        return purchasedItems;
    }

    @Override
    public String toString() {
        return userName + " pénze: " + money;
    }
}
