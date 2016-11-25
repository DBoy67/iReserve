package ui;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.Booking;
import models.Flight;
import models.Food;
import models.IFlight;
import models.Menu;
import models.Seat;
import models.Ticket;

/**
 * @author DBoy67 - Main
 * @author SirhH - Food & Profit
 */
public class BookerMain {
    private static int profit;

    private static void countProfit(Booking booking) {
        profit += booking.getTotalPrice();
        System.out.println("Total company profit: " + (profit * 0.3));
    }

    private static List<Food> handleMenu(String command) {
        Menu m = new Menu();
        ArrayList<Food> bookedMenuForEconomyClass = new ArrayList<>();
        ArrayList<Food> bookedMenuForFirstClass = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Book a menu");
        System.out.println("Menu: ");

        switch (command) {

            //First Class
            case "f":


                System.out.println(m.FirstClassMenutoString());
                System.out.println("Example: 1,2,3");
                String menuOrdering2 = sc.nextLine();
                if (!menuOrdering2.equals("")) {

                    String[] toParse2 = menuOrdering2.split(",");
                    try {
                        for (String s : toParse2) {
                            int parsed = Integer.parseInt(s);
                            bookedMenuForFirstClass.add(m.getFromFirstClassMenu(parsed));
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Wrong format");
                    }
                }
                System.out.println("You have chosen: " + (!(menuOrdering2.equals("")) ? menuOrdering2 : "to not order any food"));
                bookedMenuForFirstClass.forEach(System.out::println);
                double sum = 0;
                for (Food food : bookedMenuForFirstClass) {
                    sum += food.getPrice();
                }
                System.out.println("Menu total :" + sum + "kr");
                return bookedMenuForFirstClass;

            //Economy Class
            case "e":

                System.out.println(m.EconomyClassMenutoString());
                System.out.println("Example: 1,2,3");
                String menuOrdering1 = sc.nextLine();
                if (!menuOrdering1.equals("")) {

                    String[] toParse1 = menuOrdering1.split(",");
                    try {
                        for (String s : toParse1) {
                            int parsed = Integer.parseInt(s);
                            bookedMenuForEconomyClass.add(m.getFromEconomyClassMenu(parsed));

                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Wrong format");
                    }

                }
                System.out.println("You have chosen: " + (!(menuOrdering1.equals("")) ? menuOrdering1 : "to not order any food"));
                bookedMenuForEconomyClass.forEach(System.out::println);
                double sum2 = 0;
                for (Food food : bookedMenuForEconomyClass) {
                    sum2 += food.getPrice();
                }
                System.out.println("Menu total :" + sum2 + "kr");
                return bookedMenuForEconomyClass;
        }

        //System.out.println(m.getFromEconomyClassMenu(1));
        //System.out.println(m.getFromFirstClassMenu(1));

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int whatToDo = 0;
        Scanner in = new Scanner(System.in);
        NumberFormat numberFormatter;
        numberFormatter = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("sv-SE"));
        Flight flight = new Flight();

        while (whatToDo != 8) {
            System.out.println("Welcome. What do you want to do?");

            System.out.println("1. Book a flight.");
            System.out.println("8. Exit");
            System.out.print("Please choose a number: ");

            try {

                whatToDo = Integer.parseInt(in.nextLine());

                switch (whatToDo) {
                    case 1:
                        String passengerName;
                        String classChoice;
                        String travelClass;
                        boolean freeSeat;
                        boolean freeSeatFC = true;
                        boolean freeSeatEC = true;

                        int seatNo;
                        String wannaSwitchClass;

                        System.out.print("Please enter your name : ");
                        passengerName = in.nextLine();
                        Booking booking = new Booking(passengerName);
                        System.out.println("Welcome " + booking.getCustomerName());
                        System.out.println(" ");

                        System.out.print("Please choose First Class or Economy Class (F/E): ");
                        classChoice = in.nextLine();

                        if (classChoice.equalsIgnoreCase("F")) {
                            freeSeat = flight.findFreeSeat(classChoice);

                            if (freeSeat == true) {
                                Ticket ticket = new Ticket(classChoice);
                                seatNo = flight.setSeat(classChoice);
                                Seat seat = new Seat(seatNo, classChoice, "Occupied");
                                flight.selectSeat(seatNo, seat, ticket.getTicketClass());
                                booking.setSeat(seat);
                                booking.setTravelClass(ticket.getTicketClass());
                                booking.setTicketPrice(ticket.getTicketPrice());
                                System.out.println("Your seat nr in " + booking.getTravelClass() + " is " + booking.getSeat().getSeatNo() + " and the ticket price is " + numberFormatter.format(booking.getTicketPrice()));
                                System.out.println(" ");
                                booking.setDishes(handleMenu("f"));
                                countProfit(booking);
                                break;
                            } else if (freeSeat == false) {
                                if (flight.findFreeSeat("e") == false) {
                                    System.out.println("Sorry but the the flight is fully booked.");
                                    System.out.println(" ");
                                    break;
                                } else if (flight.findFreeSeat("e") == true) {
                                    System.out.println("Sorry. There are no free seats in First Class");
                                    System.out.print("Would you like to check for free seats in Economy Class (Y/N)? ");
                                    System.out.println(" ");
                                    wannaSwitchClass = in.nextLine();
                                    if (wannaSwitchClass.equalsIgnoreCase("Y")) {
                                        classChoice = "E";
                                        freeSeat = flight.findFreeSeat(classChoice);
                                        if (freeSeat == true) {
                                            Ticket ticket = new Ticket(classChoice);
                                            seatNo = flight.setSeat(classChoice);
                                            Seat seat = new Seat(seatNo, classChoice, "Occupied");
                                            flight.selectSeat(seatNo, seat, ticket.getTicketClass());
                                            booking.setSeat(seat);
                                            booking.setTravelClass(ticket.getTicketClass());
                                            booking.setTicketPrice(ticket.getTicketPrice());
                                            System.out.println("Your seat nr in " + booking.getTravelClass() + " is " + booking.getSeat().getSeatNo() + " and the ticket price is " + numberFormatter.format(booking.getTicketPrice()));
                                            System.out.println(" ");
                                            booking.setDishes(handleMenu("e"));
                                            countProfit(booking);
                                            break;
                                        } else if (wannaSwitchClass.equalsIgnoreCase("N")) {
                                            System.out.println("Sorry but the the flight is fully booked.");
                                            System.out.println(" ");
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (classChoice.equalsIgnoreCase("E")) {
                            freeSeat = flight.findFreeSeat(classChoice);
                            if (freeSeat == true) {
                                Ticket ticket = new Ticket(classChoice);
                                seatNo = flight.setSeat(classChoice);
                                Seat seat = new Seat(seatNo, classChoice, "Occupied");
                                flight.selectSeat(seatNo, seat, ticket.getTicketClass());
                                booking.setSeat(seat);
                                booking.setTravelClass(ticket.getTicketClass());
                                booking.setTicketPrice(ticket.getTicketPrice());
                                System.out.println("Your seat nr in " + booking.getTravelClass() + " is " + booking.getSeat().getSeatNo() + " and the ticket price is " + numberFormatter.format(booking.getTicketPrice()));
                                System.out.println(" ");
                                booking.setDishes(handleMenu("e"));
                                countProfit(booking);
                                break;
                            } else if (freeSeat == false) {
                                if (flight.findFreeSeat("f") == false) {
                                    System.out.println("Sorry but the the flight is fully booked.");
                                    System.out.println(" ");
                                    break;
                                } else if (flight.findFreeSeat("f") == true) {
                                    System.out.println("Sorry. There are no free seats in Economy Class");
                                    System.out.print("Would you like to check for free seats in First Class (Y/N)? ");
                                    wannaSwitchClass = in.nextLine();
                                    if (wannaSwitchClass.equalsIgnoreCase("Y")) {
                                        classChoice = "F";
                                        freeSeat = flight.findFreeSeat(classChoice);
                                        if (freeSeat == true) {
                                            Ticket ticket = new Ticket(classChoice);
                                            seatNo = flight.setSeat(classChoice);
                                            Seat seat = new Seat(seatNo, classChoice, "Occupied");
                                            flight.selectSeat(seatNo, seat, ticket.getTicketClass());
                                            booking.setSeat(seat);
                                            booking.setTravelClass(ticket.getTicketClass());
                                            booking.setTicketPrice(ticket.getTicketPrice());
                                            System.out.println("Your seat nr in " + booking.getTravelClass() + " is " + booking.getSeat().getSeatNo() + " and the ticket price is " + numberFormatter.format(booking.getTicketPrice()));
                                            System.out.println(" ");
                                                booking.setDishes(handleMenu("f"));
                                                countProfit(booking);
                                            break;
                                        } else if (wannaSwitchClass.equalsIgnoreCase("N")) {
                                            System.out.println("Sorry but the the flight is fully booked.");
                                            System.out.println(" ");
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    case 8:
                        in.close();
                        System.exit(0);
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Wrong input. Please choose a number from the menu.");
                System.out.println(" ");
            }
        }
    }

}
