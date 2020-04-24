package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
public void heroIsCreatedCorrectly_true() throws Exception
{
    Hero hero=createNewHero();
    assertEquals(true,hero instanceof Hero);
}

    @Test
    public void heroInstantiatesWithName() throws Exception {
        Hero hero=createNewHero();
        assertEquals("Super Girl",hero.getmName());
    }
    @Test
    public void heroInstantiatesWithAge()throws Exception
    {
        Hero hero = createNewHero();
        assertEquals(35,hero.getmAge());
    }
    @Test
    public void heroInstantiatesWithSuperPowers() throws Exception
    {
        Hero hero = createNewHero();
        assertEquals("Flying",hero.getmSpecialPowers());
    }

    @Test
    public void heroInstantiatesWithHeroesWeakness() throws  Exception
    {
        Hero hero=createNewHero();
        assertEquals("stones",hero.getmWeakness());
    }

    public Hero createNewHero()
    {
        return new Hero("Super Girl",35,"Flying", "stones",1);

    }
}