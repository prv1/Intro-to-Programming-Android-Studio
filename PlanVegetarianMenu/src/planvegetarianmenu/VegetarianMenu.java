/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planvegetarianmenu;

/**
 *
 * @author bekkiviau
 */
public class VegetarianMenu extends Menu {
    String[] vegEntreeChoice = {"Spinach Lasagna", "Cheese Enchiladas", "Fruit Plate"};
    public VegetarianMenu(){
        super();
        for(int x = 0; x < vegEntreeChoice.length; ++x){
            entreeChoice[x] = vegEntreeChoice[x];
        }
    }
}

