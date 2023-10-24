/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testbuildings;

/**
 *
 * @author cui
 */
public class TestBuildings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Building house=new Building();
        house.setfloor(80);
        house.setarea(9000);
        house.setfoccupant(800);
        house.getareaperperson();
         Building office=new Building();
         office.setarea(7800);
         office.setfloor(56);
         office.setfoccupant(6000);
         office.getareaperperson();
         System.out.printf("Area per person of house %f\n",house.getareaperperson() );
          System.out.printf("Area per person of house %f\n",office.getareaperperson() );
    }
    
}
