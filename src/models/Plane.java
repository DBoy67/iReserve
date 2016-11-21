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
public abstract class Plane implements IPlane {
    
    protected List<Seat> seatList;
    protected int seatNo;

    public Plane() {
    }

    @Override
    public abstract int findFreeSeat(String travelClass) throws BookedFullException;

    @Override
    public abstract void switchSeatStatus(int seatNo);

    @Override
    public abstract void addSeat(Seat seat);

    @Override
    public abstract List<Seat> getSeatList();
    
}
