import java.util.*;

public class OrdersMain {
    public static void main(String[] args){
        ArrayList<Orders> list = new ArrayList();
        list.add(new Orders("A01","C1",new Date(System.currentTimeMillis()-100)));
        list.add(new Orders("A02","C1",new Date(System.currentTimeMillis()-50)));
        list.add(new Orders("A01","C3",new Date(System.currentTimeMillis()-100)));
        list.add(new Orders("A03","C1",new Date(System.currentTimeMillis()-30)));
        list.add(new Orders("A02","C2",new Date(System.currentTimeMillis()-50)));

        Map<String,Orders> ordersMap = new LinkedHashMap<>();
        for(Orders ord : list ){
            Orders o = ordersMap.get(ord.getOrderID());
            if(o == null || o.getDate().after(o.getDate())){
                ordersMap.put(ord.getOrderID(), ord);
            }
        }
        Set<String> order1 = ordersMap.keySet();
        for(String s : order1){
            System.out.println(ordersMap.get(s).toString());
        }
        System.out.println(ordersMap);
    }
}
