import java.util.Date;

public class Orders {
    private String orderID;
    private String orderStatus;
    private Date date;

    public Orders(String orderID,String orderStatus,Date date){
        this.orderID=orderID;
        this.orderStatus=orderStatus;
        this.date=date;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public Date getDate() {
        return date;
    }


    @Override
    public String toString() {
        return "Orders{" +
                "orderID='" + orderID + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
