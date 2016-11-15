package models;

import java.util.ArrayList;
import java.util.List;

public class AirPlane {

    private List<Seat> seatList = new ArrayList<>();
    private int id;

    public void Airplane(int id) {
	this.id = id;
    }
    
    public List<Seat> getSeats(int id){
	return seatList;
	
    }
}
