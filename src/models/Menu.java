/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//for testing
import java.util.Scanner;

/**
 *
 * @author Tony Eriksson <Tony.Eriksson>
 */
public class Menu {

    List<Food> menu;

    public Menu() {
        menu = new ArrayList<>();
        menu.add(new Food("Beef with fries in wine sauce", 129.90, "First Class"));
        menu.add(new Food("Finest Lobster menu", 139.90, "First Class"));
        menu.add(new Food("Warm soup menu", 49.90, "First Class"));
        menu.add(new Food("Beer", 59.90, "First Class"));
        menu.add(new Food("Wine", 89.90, "First Class"));
        menu.add(new Food("Juice", 34.90, "First Class"));

        menu.add(new Food("Burger", 49.90, "Economy Class"));
        menu.add(new Food("Carbonara", 69.90, "Economy Class"));
        menu.add(new Food("Double sandwich", 39.90, "Economy Class"));
        menu.add(new Food("Hot dog", 29.90, "Economy Class"));
        menu.add(new Food("Coffee", 29.00, "Economy Class"));
        menu.add(new Food("Soda", 36.50, "Economy Class"));
        menu.add(new Food("Water", 10.00, "Economy Class"));

    }

    /**
     * This method returns the selected food from the Economy Class menu by the
     * printed index number (1,2,3 and so on)
     *
     * @param index
     * @return
     */
    public Food getFromEconomyClassMenu(int index) {
        return this.getEconomyClassMenu().get(index - 1);
    }

    /**
     * This method returns the selected food from the First Class menu by the
     * printed index number (1,2,3 and so on)
     *
     * @param index
     * @return
     */
    public Food getFromFirstClassMenu(int index) {
        return this.getFirstClassMenu().get(index - 1);
    }

    /**
     * Returns a uneditable copy of the Economy Class menu
     *
     * @return
     */
    public List<Food> getEconomyClassMenu() {
        List<Food> basic = new ArrayList<>();
        for (int i = 6; i < menu.size(); i++) {
            basic.add(menu.get(i));
        }
        return Collections.unmodifiableList(basic);
    }

    /**
     * Returns a uneditable copy of the First Class menu
     *
     * @return
     */
    public List<Food> getFirstClassMenu() {
        return Collections.unmodifiableList(menu);
    }

    /**
     * Use insted of calling the toString method for printing the Economy Class
     * menu.
     *
     * @return
     */
    public String EconomyClassMenutoString() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Food food : this.getEconomyClassMenu()) {
            sb.append(i);
            sb.append(". ");
            i++;
            sb.append(food);
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Use insted of calling the toString method for printing the First Class
     * menu.
     *
     * @return
     */
    public String FirstClassMenutoString() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Food food : this.getFirstClassMenu()) {
            sb.append(i);
            sb.append(". ");
            i++;
            sb.append(food);
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Running Example
     * 
     * The list is printed and the user can choose an item to add to their
     * bookedMenu-ArrayList
     */
    
    /*public static void main(String[] args) {
        Menu m = new Menu();
        ArrayList<Food> bookedMenuForEconomyClass = new ArrayList<>();
        ArrayList<Food> bookedMenuForFirstClass = new ArrayList<>();
        System.out.println(m.getEconomyClassMenu());
        System.out.println(m.getFirstClassMenu());
        System.out.println(m.getFromEconomyClassMenu(1));
        System.out.println(m.getFromFirstClassMenu(1));

        Scanner sc = new Scanner(System.in);

        System.out.println("Book a menu");
        System.out.println("Menu: ");

        //Economy Class
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

        //First Class
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

    }*/
}
