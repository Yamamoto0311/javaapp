import java.util.List;

public class Order {
    List<Menu> menuList;
    int tableNum;
    int guestNum;
    boolean isPaid;
    String staff;

    public Order(List<Menu> menuList, int tableNum, int guestNum, boolean isPaid, String staff) {
        this.menuList = menuList;
        this.tableNum = tableNum;
        this.guestNum = guestNum;
        this.isPaid = isPaid;
        this.staff = staff;
    }

    public int getTotalAmount() {
        int total = 0;
        for (Menu menu : menuList) {
            total += menu.price;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "menuList=" + menuList +
                ", tableNum=" + tableNum +
                ", guestNum=" + guestNum +
                ", isPaid=" + isPaid +
                ", staff='" + staff + '\'' +
                '}';
    }
}
