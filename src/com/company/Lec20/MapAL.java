package com.company.Lec20;

import java.util.ArrayList;
import java.util.LinkedList;

public class MapAL {

    private ArrayList<LinkedList<Entity>> list;

    public MapAL() {
        list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(String key, String value)
    {
        int hash= Math.abs(key.hashCode()% list.size());
        LinkedList<Entity> temp = list.get(hash);
        for (Entity entity: temp) {
            if (entity.key.equals(key)){
                entity.value=value;
                return;
            }
        }
        temp.add(new Entity(key,value));
    }

    public String get(String key)
    {
        int hash= Math.abs(key.hashCode()% list.size());
        LinkedList<Entity> temp = list.get(hash);
        for (Entity entity: temp) {
            if (entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }

    public void remove(String key)
    {
        int hash= Math.abs(key.hashCode()% list.size());
        LinkedList<Entity> temp = list.get(hash);
        for (Entity entity: temp) {
            if (entity.key.equals(key)){
                list.remove(entity);
            }
        }
    }

    public boolean containsKey(String key){
        return get(key)!=null;
    }

    private class Entity
    {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }


}
