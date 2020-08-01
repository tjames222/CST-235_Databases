package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;

/**
 * Session Bean implementation class OrdersBusinessService
 */
@Stateless
@Local(OrdersBusinessInterface.class)
@Alternative
public class OrdersBusinessService implements OrdersBusinessInterface {

	List<Order> orders = new ArrayList<Order>();
    /**
     * Default constructor. 
     */
    public OrdersBusinessService() {
    	orders.add(new Order("1234", "This is Product1", (float)10.00, 1));
		orders.add(new Order("1235", "This is Product2", (float)10.00, 1));
		orders.add(new Order("1236", "This is Product3", (float)10.00, 1));
		orders.add(new Order("1237", "This is Product4", (float)10.00, 1));
		orders.add(new Order("1238", "This is Product5", (float)10.00, 1));
		orders.add(new Order("1239", "This is Product6", (float)10.00, 1));
		orders.add(new Order("1240", "This is Product7", (float)10.00, 1));
    }

	/**
     * @see OrdersBusinessInterface#test()
     */
    @Override
    public void test() {
        System.out.println("Hello from the OrdersBusinessService");
    }

	@Override
	public List<Order> getOrders() {
		return orders;
	}

	@Override
	public void setOrders(List<Order> orders) {
		this.orders = orders;
		
	}

}
