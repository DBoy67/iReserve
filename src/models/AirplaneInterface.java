package models;

import java.util.HashMap;

/**
 *
 * @author Tony Eriksson <Tony.Eriksson>
 */
public interface AirplaneInterface {

    /**
     * @return
     */
    int getMaxSeats();

    /**
     * @return
     */
    
    
    String getPlaneName();

    /**
     * @return
     */
    int getPlaneNo();

    /**
     * @param seatNo
     * @return
     */
    Seat getSeat(Integer seatNo);

    /**
     * @return
     */
    HashMap<Integer, Seat> getSeats();

    /**
     * @param seatNo
     * @param seat
     */
    void selectSeat(Integer seatNo, Seat seat);

    /**
     * @param maxSeats
     */
    void setMaxSeats(int maxSeats);

    /**
     * @param planeName
     */
    void setPlaneName(String planeName);

    /**
     * @param planeNo
     */
    void setPlaneNo(int planeNo);
    
}
