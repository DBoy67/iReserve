/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author Tony Eriksson <Tony.Eriksson>
 */
public interface IPlane {

    void addSeat(Seat seat);
    
    int findFreeSeat (String classChoice) throws BookedFullException;

    List<Seat> getSeatList();

    int getSeatListSize();

    void switchSeatStatus(int seatNo);
    
}
