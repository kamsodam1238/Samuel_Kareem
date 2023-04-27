package coffee.misc;

import java.util.Date;

public class Payment {

    private String paymentId;

    private double amount;

    private String paymentMethod;

    private Date date;

    private String status;


    public Payment(String paymentId,String paymentMethod,double amount) {
        this.amount = amount;
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
        this.date = new Date();
        this.status = "Unapproved"; //Initialize pay status to unapproved
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void complete(){
        this.status = "Approved";
    }

    public void cancel(){
        this.status = "Cancelled";
    }

}
