package sethdh.pizzaorder.model;

import java.time.LocalDateTime;

public class Order {
    int userOrderID;
    String orderType;
    String orderSize;
    Boolean hasPepperoni;
    Boolean hasBacon;
    Boolean hasPineapple;
    Boolean hasPeppers;
    Boolean hasOnions;
    Boolean hasMushrooms;
    int numOfPizzas;
    double totalPrice;
    LocalDateTime orderTime;

    public Order(){
        this.userOrderID = 0;
        this.orderType = "Delivery";
        this.orderSize = "Small";
        this.hasPepperoni = false;
        this.hasBacon = false;
        this.hasPineapple = false;
        this.hasPeppers = false;
        this.hasOnions = false;
        this.hasMushrooms = false;
        this.numOfPizzas = 0;
        this.totalPrice = 0.0;
        this.orderTime = null;
    }

    public int getUserOrderID() {return this.userOrderID;}
    public void setUserOrderID(int userOrderID) {this.userOrderID = userOrderID;}

    public String getOrderType() {
        return orderType;
    }
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Boolean getHasPepperoni() {
        return hasPepperoni;
    }
    public void setHasPepperoni(Boolean hasPepperoni) {
        this.hasPepperoni = hasPepperoni;
    }

    public String getOrderSize() {
        return orderSize;
    }
    public void setOrderSize(String orderSize) {
        this.orderSize = orderSize;
    }

    public Boolean getHasBacon() {
        return hasBacon;
    }
    public void setHasBacon(Boolean hasBacon) {
        this.hasBacon = hasBacon;
    }

    public Boolean getHasPineapple() {
        return hasPineapple;
    }
    public void setHasPineapple(Boolean hasPineapple) {
        this.hasPineapple = hasPineapple;
    }

    public Boolean getHasPeppers() {
        return hasPeppers;
    }
    public void setHasPeppers(Boolean hasPeppers) {
        this.hasPeppers = hasPeppers;
    }

    public Boolean getHasOnions() {
        return hasOnions;
    }
    public void setHasOnions(Boolean hasOnions) {
        this.hasOnions = hasOnions;
    }

    public Boolean getHasMushrooms() {
        return hasMushrooms;
    }
    public void setHasMushrooms(Boolean hasMushrooms) {
        this.hasMushrooms = hasMushrooms;
    }

    public int getNumOfPizzas() {
        return numOfPizzas;
    }
    public void setNumOfPizzas(int numOfPizzas) {
        this.numOfPizzas = numOfPizzas;
    }

    public double getTotalPrice() {return this.totalPrice;}
    public void calculateTotalPrice() {
        int numOfTopppings = 0;

        if(orderType.equals("Delivery")){
            totalPrice += 5.0;
        }

        if(orderSize.equals("Small")){
            totalPrice += 10.0;
        }else if(orderSize.equals("Medium")){
            totalPrice += 13.0;
        }else if(orderSize.equals("Large")){
            totalPrice += 17.0;
        }

        if(hasPepperoni){numOfTopppings++;}
        if(hasBacon){numOfTopppings++;}
        if(hasPineapple){numOfTopppings++;}
        if(hasPeppers){numOfTopppings++;}
        if(hasOnions){numOfTopppings++;}
        if(hasMushrooms){numOfTopppings++;}

        if(numOfTopppings%4 > 1){
            totalPrice += numOfTopppings - 1;
        }else {
            totalPrice += numOfTopppings;
        }

        totalPrice *= numOfPizzas;
    }

    void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }
    void CalulateReadyTime(){
        if(orderType.equals("Delivery")){
            orderTime = orderTime.plusHours(1);
        }else{
            orderTime = orderTime.plusHours(2);
        }
    }
}
