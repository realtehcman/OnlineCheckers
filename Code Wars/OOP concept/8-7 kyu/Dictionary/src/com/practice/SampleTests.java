package com.practice;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
/*
* passing the object as an argument*/

public class SampleTests {
    @Test
    public void Tests()
    {
        Dictionary d = new Dictionary();
        ArrayList<Definition> list = new ArrayList<>();

        d.newEntry("Apple", "A fruit", list);
        assertEquals("A fruit", d.look("Apple",list));

        d.newEntry("Soccer", "A sport",list);
        assertEquals("A sport", d.look("Soccer",list));

        assertEquals("Cant find entry for Hi", d.look("Hi",list));
        assertEquals("Cant find entry for Ball", d.look("Ball",list));

        d.newEntry("soccer", "a sport",list);
        assertEquals("a sport", d.look("soccer",list));
    }
}