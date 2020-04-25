package dao;

import models.Hero;

import java.util.List;

public interface HeroDao {
//    get entire list
List<Hero> getAll();

// create
    void add (Hero hero);

//    Read
    Hero findById(int id);

//    Update
    void update(int id, String name, int age,String specialPowers,String weakness);

//    Delete
    void deleteById(int id);
    void clearAll();
}
