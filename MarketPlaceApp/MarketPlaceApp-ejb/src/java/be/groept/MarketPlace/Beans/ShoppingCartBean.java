/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.groept.MarketPlace.Beans;

import be.groept.MarketPlace.Entities.Item;
import javax.ejb.Stateful;

/**
 *
 * @author Sam
 */
@Stateful
public class ShoppingCartBean implements ShoppingCartBeanLocal {

    @Override
    public void addItem(Item item) {
        System.out.println("Item: " + item.getName() + "added.");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
