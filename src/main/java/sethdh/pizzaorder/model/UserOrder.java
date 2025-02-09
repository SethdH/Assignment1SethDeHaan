package sethdh.pizzaorder.model;

public class UserOrder {
    String fName;
    String lName;
    String phoneNumber;
    String address;

    public UserOrder(String fName, String lName, String phoneNumber, String address) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.address = address;
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
}

