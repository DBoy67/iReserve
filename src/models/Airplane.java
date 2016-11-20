package models;

import java.util.HashMap;
import java.util.Map;
import utilities.SeatStatus;

/**
 * @author Surekha
 * @DBoy
 */
public class Airplane {

    private int planeNo;
    private Map<Integer, SeatStatus> firstClassSeatMap;
    private Map<Integer, SeatStatus> economyClassSeatMap;

    public Airplane(int planeNo) {
	this.planeNo = planeNo;
	firstClassSeatMap = new HashMap<>();
	economyClassSeatMap = new HashMap<>();
    }

    public void addSeat(int seatNo){
	firstClassSeatMap.put(seatNo, SeatStatus.OCCUPIED);
    }
    
    public int getPlaneNo() {
	return planeNo;
    }
    
    public int getFCSeatMapSize(){
	return firstClassSeatMap.size();
    }
  
        public int getECSeatMapSize(){
	return economyClassSeatMap.size();
    }

    public Map<Integer, SeatStatus> getFirstClassSeatMap() {
	return firstClassSeatMap;
    }

    public Map<Integer, SeatStatus> getEconomyClassSeatMap() {
	return economyClassSeatMap;
    }

}