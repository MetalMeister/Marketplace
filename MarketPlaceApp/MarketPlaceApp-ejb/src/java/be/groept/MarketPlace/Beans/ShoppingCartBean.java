/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.groept.MarketPlace.Beans;

import be.groept.MarketPlace.Entities.Item;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Sam
 */
@Stateful
public class ShoppingCartBean implements ShoppingCartBeanLocal {
    
    private List<Item> itemList = new LinkedList<>();;

    @Override
    public void addItem(Item item) {
        itemList.add(item);
        System.out.println("Item: " + item.getName() + "added.");
    }

    @Override
    public double getTotalPrice() {
        return itemList.stream().mapToDouble(i -> i.getPrice()).sum();
    }
    
}
