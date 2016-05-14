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
public class Order {
    private static int count =0;
    
    private int orderNum;
    private ArrayList<OrderItem> orderList;
    private OrderItem o1;
    
    public Order(){
        orderList= new ArrayList<OrderItem>();
        orderNum=++count;
        

    }
    
    public void removeOrderItem(OrderItem orderItem){
        orderList.remove(orderItem);
        
    }

    
    
    public OrderItem addOrderItem(Drug product, int quantity, int price){
        OrderItem orderItem = new OrderItem();
        orderList.add(orderItem);
        orderItem.setDrug(product);
        orderItem.setQuantity(quantity);
        orderItem.setSalesPrice(price);
        return orderItem;
        
        
    }
    
    public OrderItem findMaxSoldQuantity(){
        int max=0;
        for(OrderItem orderItem:orderList){
            if(orderItem.getQuantity()>max){
                max=orderItem.getQuantity();
                o1=orderItem;
            }
        }
        return o1;
        
    }
    
    
    public OrderItem searchOrderItemByProduct(Drug product){
        
        for(OrderItem orderItem: orderList)
        {
            if(orderItem.getDrug()==product){
                return  orderItem;
            }
        }        
        return null;
    }

    public static int getCount() {
        return count;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public ArrayList<OrderItem> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<OrderItem> orderList) {
        this.orderList = orderList;
    }
    
    
    
}
