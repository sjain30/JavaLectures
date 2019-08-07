package com.company.Lec20;

import java.util.LinkedList;

public class MapsUsingLL {

    private LinkedList<Entity> list = new LinkedList<>();

    private class Entity
    {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(String key, String value)
    {
        for (Entity entity: list) {
            if (entity.key.equals(key)){
                entity.value=value;
                return;
            }
        }
        list.add(new Entity(key,value));
    }

    public String get(String key)
    {
        for (Entity entity: list) {
            if (entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }

    public void remove(String key)
    {
        for (Entity entity: list) {
            if (entity.key.equals(key)){
                list.remove(entity);
            }
        }
    }

    @Override
    public String toString() {
        String s ="{";
        for (Entity entity: list) {
            s+=entity.key+" = "+entity.value+" , ";
        }
        s+="}";
        return s;
    }

    public void display()
    {
        for (Entity entity: list) {
            System.out.println(entity.key+" : "+ entity.value);
        }
    }

}
