package oop.sample.game.mechanics;

public interface Movable {
    /**
     * движение юнита
     * @param speed скорость движения
     * */
    void move(int speed);
    /**
     *Мгновенное перемещение юнита
     * */
    default void move(){
        System.out.println("teleporting object");
    }
}