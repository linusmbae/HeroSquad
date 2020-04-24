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


    public Hero createNewHero()
    {
        return new Hero("Super Girl",35,"Flying", "stones",1);

    }
}