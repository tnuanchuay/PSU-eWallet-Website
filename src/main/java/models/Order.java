package models;

import java.util.Date;

/**
 * Created by tnuanchuay on 4/9/2017.
 */
public class Order {
    int     id;
    Date    orderDate;
    int     count;
    char    productType;
    double  totalPayment;
    String  productName;
    double  productPrice;

    public Order(int id,
                 Date orderDate,
                 int count,
                 char productType,
                 double totalPayment,
                 String productName,
                 double productPrice) {
        this.id = id;
        this.orderDate = orderDate;
        this.count = count;
        this.productType = productType;
        this.totalPayment = totalPayment;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Order(Date orderDate, int count, char productType, double totalPayment, String productName, double productPrice) {
        this.orderDate = orderDate;
        this.count = count;
        this.productType = productType;
        this.totalPayment = totalPayment;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getId() {
        return id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public int getCount() {
        return count;
    }

    public char getProductType() {
        return productType;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
