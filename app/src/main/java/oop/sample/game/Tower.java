package oop.sample.game;

import oop.sample.game.mechanics.Attacking;

/*
 *Абстрактный класс (реализация метода attack из Attackable не представлена,
 * а также есть абстрактный метод getCapacity)
 * */
public abstract class Tower extends Unit implements Attacking {
    /**
     * Обновление башни
     * @param cost цена обновления
     * */
    abstract void upgrade(float cost);
}