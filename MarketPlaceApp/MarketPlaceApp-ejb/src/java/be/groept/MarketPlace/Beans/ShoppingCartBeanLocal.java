/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.groept.MarketPlace.Beans;

import be.groept.MarketPlace.Entities.Item;
import javax.ejb.Local;

/**
 *
 * @author Sam
 */
@Local
public interface ShoppingCartBeanLocal {

    void addItem(Item item);

    double getTotalPrice();
    
}
