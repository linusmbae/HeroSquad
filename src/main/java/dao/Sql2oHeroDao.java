package dao;

import models.Hero;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oHeroDao implements HeroDao {
    private final Sql2o sql2o;

    public Sql2oHeroDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }
// returns list from heroes table
    @Override
    public List<Hero> getAll() {
        try (Connection conn=sql2o.open())
        {
            return conn.createQuery("SELECT * FROM heroes")
                    .executeAndFetch(Hero.class);
        }
    }
// creates a new row in the database with hero details
    @Override
    public void add(Hero hero) {
    String  sql = "INSERT INTO heroes (name, age, powers, weakness) VALUES (:age, :age, :powers, :weakness)";
        try (Connection conn=sql2o.open()) {
            int id = (int) conn.createQuery(sql,true)
                    .bind(hero)
                    .executeUpdate()
                    .getKey();
            hero.setmId(id);
        }catch (Sql2oException ex)
        {
            System.out.println(ex);
        }
    }
//  returns input by the assigned id
    @Override
    public Hero findById(int id) {
        try (Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM heroes WHERE id =:id")
                    .addParameter("id",id)
                    .executeAndFetchFirst(Hero.class);
        }
    }
// Update hero details
    @Override
    public void update(int id, String name, int age, String specialPowers, String weakness) {
    String sql ="UPDATE heroes SET (name, age, powers, weakness)=(:name, :age, :specialPowers, :weakness) WHERE id=:id";
    try (Connection conn=sql2o.open()) {
        conn.createQuery(sql)
                .addParameter("name",name)
                .addParameter("age",age)
                .addParameter("powers",specialPowers)
                .addParameter("weakness",weakness)
                .executeUpdate();
    }catch (Sql2oException ex)
    {
        System.out.println(ex);
    }
    }

    @Override
    public void deleteById(int id) {
    String sql ="DELETE from heroes WHERE id =:id";
    try (Connection conn = sql2o.open())
    {
        conn.createQuery(sql)
                .addParameter("id",id)
                .executeUpdate();
    }catch (Sql2oException ex)
    {
        System.out.println(ex);
    }
    }

    @Override
    public void clearAll() {
        String sql = "DELETE from heroes";
        try (Connection conn = sql2o.open())
        {
            conn.createQuery(sql)
                    .executeUpdate();
        }catch (Sql2oException ex)
        {
            System.out.println(ex);
        }

    }
}
