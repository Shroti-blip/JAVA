/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class CricketIN extends SportsIN{
String player;
    void setInfo(String player){
        this.player = player;
    }
    void getInfo(){
        System.out.println(player);
    }
    public static void main(String[] args) {
        CricketIN ci = new CricketIN();
        ci.setInfo("Muskan");
        ci.getInfo();
        ci.setData("Cricket", 11);
        ci.getData();
    }
    
}
