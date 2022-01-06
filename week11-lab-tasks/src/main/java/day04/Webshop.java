package day04;

import java.util.List;

public class Webshop {

    private List<User> users;
    private List<Item> items; //ahonnan vásárolhatsz

    public Webshop(List<User> users, List<Item> items) {
        this.users = users;
        this.items = items;
    }

    public void selling() { //itt lehet vásárolni
        System.out.println();
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Item> getItems() {
        return items;
    }

    public void printItems() {
        for (Item i: items) {
            System.out.println(i);
        }
    }
}
