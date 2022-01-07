package day04;

import java.time.LocalDate;
import java.util.List;

public class Webshop {

    private List<User> users;
    private List<Item> items; //ahonnan vásárolhatsz

    public Webshop(List<User> users, List<Item> items) {
        this.users = users;
        this.items = items;
    }

    public void selling(User user, Item item) { //itt lehet vásárolni
        for (User u: users) {
            if (u.getUserName().equals(user.getUserName())) {
                for (Item it: items) {
                    if (it.getName().equals(item.getName())) {
                        if (it instanceof Product) {
                            LocalDate expirationDate = LocalDate.now().plusMonths(3);
                            ((Product) it).setExpirationDate(expirationDate);
                        }
                        if (it instanceof Service) {
                            LocalDate expirationDate = LocalDate.now().plusMonths(12);
                            ((Service) it).setExpirationDate(expirationDate);
                        }
                        u.shopping(it);
                    }
                }
            }
        }
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
