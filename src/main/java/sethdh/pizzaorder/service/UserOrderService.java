package sethdh.pizzaorder.service;

import org.springframework.stereotype.Service;
import sethdh.pizzaorder.model.Order;
import sethdh.pizzaorder.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserOrderService {
    int currentUserID = 0;
    List<User> users;
    List<Order> orders;
    public UserOrderService(){
        int CurrentUserId = 1;
        users = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public int FindUser(User user){
        for(User u : users){
            if(u.getFirstName().equalsIgnoreCase(user.getFirstName())
                    && u.getLastName().equalsIgnoreCase(user.getLastName())
                    && u.getPhoneNumber().equals(user.getPhoneNumber())){
                return u.getUserID();
            }
        }
        return 0;
    }

    public void addUserAndOrder(User user, Order order){
        // make sure the user isn't already in the list
        for(User u : users){
            if(u.getFirstName().equalsIgnoreCase(user.getFirstName())
                    && u.getLastName().equalsIgnoreCase(user.getLastName())
                    && u.getPhoneNumber().equals(user.getPhoneNumber())){
                //add the order
                addOrder(u.getUserID(), order);
                return;
            }
        }
        // add user and order
        user.setUserID(currentUserID++);
        users.add(user);
        addOrder(user.getUserID(), order);
    }

    void addOrder(int id, Order order){
        orders.add(order);
        order.setUserOrderID(id); // make sure it's connected to a user
    }

    public List<Order> getOrders(User user){
        int id = FindUser(user);
        List<Order> userOrders = new ArrayList<>();
        for(Order o : orders){
            if(o.getUserOrderID() == id){
                userOrders.add(o);
            }
        }
        return userOrders;
    }
}
