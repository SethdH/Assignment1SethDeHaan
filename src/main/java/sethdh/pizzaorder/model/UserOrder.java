package sethdh.pizzaorder.model;

import java.util.List;

public class UserOrder {
    String fName;
    String lName;
    String phoneNumber;
    String address;

    //pizza building
    String deliveryType;
    String pizzaSize;


    public UserOrder(String fName, String lName, String phoneNumber, String address, String deliveryType) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.deliveryType = deliveryType;
        this.pizzaSize = pizzaSize;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }
}

