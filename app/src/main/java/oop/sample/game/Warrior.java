package oop.sample.game;

import oop.sample.game.mechanics.Movable;
import oop.sample.game.mechanics.Attacking;

/*
*Класс, расширяющий класс Unit и реализующий интерфейсы Movable и Attacking
* */
public class Warrior extends Unit implements Movable, Attacking {
    public Warrior(){
        name = "wsedg";;
    }
    public Warrior(String name){
        this.name = name; 
    }

    @Override
    public void move(int speed) {
        System.out.println("running with speed "+speed);        
    }
    @Override
    public void move(){
        System.out.println("walking");
    }

    @Override
    public void attack(int damage) {
        System.out.println("attack with sword: "+damage+" hp (physical damage");
    }
}