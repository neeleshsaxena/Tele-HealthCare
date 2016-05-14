/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderCatalog;

import Business.DrugCatalog.Drug;
import java.util.ArrayList;

/**
 *
 * @author Neelu
 */
public class OrderCatalog {
    
    private ArrayList<Order> orderCatList;
   
    
    
    public OrderCatalog(){
        orderCatList = new ArrayList<Order>();
      
        
        
    }

   public Order searchOrderItemByProduct(Drug product){
        
        for(Order order: orderCatList)
        {
            for(OrderItem orderItem:order.getOrderList()){
            if(orderItem.getDrug()==product){
                return  order;
            }
            }
        }        
        return null;
    }

    public ArrayList<Order> getOrderCatList() {
        return orderCatList;
    }
    
    public Order addOrder(Order order){
        orderCatList.add(order);
        return order;
    }
    
    
    
    
}
