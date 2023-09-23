package oop.sample.game.mechanics;

/*
* пример интерфейса
* */
public interface Attacking {
    /**
     * атака противника
     * @param damage урон, который будет нанесен
     * */
    void attack(int damage);
}