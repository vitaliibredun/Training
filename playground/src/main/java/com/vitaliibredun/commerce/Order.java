package com.vitaliibredun.commerce;

public class Order {
    private String id;
    private String status;
    private String phone;
    
    public Order() {}

    public Order(String phone) {
        this.phone = phone;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return "Order [id=" + id + ", phone=" + phone + ", status=" + status + "]";
    }
}
