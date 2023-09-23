package oop.sample.game;

import java.util.UUID;

/**
 * Игровой Unit, который может быть использован в игре в качестве игрока, противника, неигрового персонажа.
 */
public class Unit {

    /**
     * уникальный идентификатор юнита
     */
    private final UUID id = UUID.randomUUID();
    ;
    /**
     * Счетчик юнитов
     */
    private static int count = 0;

    /**
     * @return число созданных юнитов
     */
    public static int getCount() {
        return count;
    }

    /**
     * имя персонажа
     */
    protected String name;

    public Unit() {
        count++;
        name = "sample";
    }

    public Unit(String name) {
        count++;
        this.name = name;
    }

    /**
     * Возвращает имя персонажа.
     *
     * @return имя персонажа
     * @throws RuntimeException если в качестве имени задана пустая строка или null
     */
    public String getName() {
        if (name == null || name.isBlank())
            throw new RuntimeException("Имя не задано!");
        return name;
    }

    /**
     * Задает имя юнита. Имя не должно быть пустым.
     *
     * @param name имя персонажа
     * @throws RuntimeException если в качестве имени задана пустая строка или null
     */
    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new RuntimeException("Имя некорректно!");
        this.name = name;
    }

    @Override
    public String toString() {
        return "{\"name\":\"" + name + "\"}";
    }
}