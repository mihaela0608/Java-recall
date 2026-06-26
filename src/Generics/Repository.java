package Generics;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {
    private List<T> items;

    public Repository() {
        this.items = new ArrayList<>();
    }

    public void add(T item){
        items.add(item);
    }

    public void remove(T item){
        items.remove(item);
    }

    public List<T> getAll(){
        return items;
    }

    public boolean contains(T item){
        return items.contains(item);
    }

    public int size(){
        return items.size();
    }
}
