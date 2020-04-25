package dao;
import models.Hero;
import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;

public class Sql2oHeroDaoTest {
    private Sql2oHeroDaoTest heroDao;
    private Connection conn;

    @Before
    public void setUp() throws Exception
    {
        String connectionString ="jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/HeroDatabase.sql'";
        Sql2o sql2o=new Sql2o(connectionString,"","");
        heroDao= new Sql2oHeroDaoTest(sql2o);
        conn=sql2o.open();
    }
@After
    public void tearDown() throws Exception
{
    conn.close();
}

    @Test
    public void addingHeroSetsId() throws Exception {
        Hero hero =createNewHero();
        int originalHeroId = hero.getmId();
        heroDao.add(hero);
        assertEquals(originalHeroId,hero.getmId());
    }

    public Hero createNewHero()
{
    return new Hero("Super Girl",35,"Flying", "stones",1);
}
}
