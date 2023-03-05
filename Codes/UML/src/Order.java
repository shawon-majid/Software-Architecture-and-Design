import java.util.*;

public class Order {
    private Date date;
    private String status;

    ArrayList<OrderDetail> orderDetails = new ArrayList<OrderDetail>(10);

    public double calcSubTotal() {
        double total = 0;
        for (OrderDetail o : orderDetails) {
            total += o.calcSubTotal();
        }
        return total;
    }

    public void calcTax() {

    }

    public void calcTotal() {

    }

    public void calcTotalWeight() {

    }

}
