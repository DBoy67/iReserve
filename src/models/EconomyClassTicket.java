/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import utilities.TravelClass;

/**
 *
 * @author Sir H
 * 
 * This classs takes everything from the Ticket class, there is no methods
 * exclusive to this class yet.
 */

public class EconomyClassTicket extends Ticket{
    
    public EconomyClassTicket(){
        super(TravelClass.ECONOMY, 5_000);
    }
    
}
