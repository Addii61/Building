/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbuildings;

/**
 *
 * @author cui
 */
public class Building {
    public double floor;
    public double area;
    public double occupant;
    public void setfloor(double a){
    this.floor=a;
}
    public void setarea(double b){
    this.area=b;
}
    public void setfoccupant(double c){
    this.occupant=c;
}
    public double getareaperperson(){
        return this.area/occupant;
}
}
