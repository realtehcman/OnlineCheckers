package tests;

import com.practice.AlphabetNuclearWar;
import org.junit.Test;

import static org.junit.Assert.*;


public class SolutionTest {
    
    @org.junit.Test
    public void alphabetWar(){
        assertEquals("abijk", AlphabetNuclearWar.alphabetWar("abijk"));
        assertEquals("", AlphabetNuclearWar.alphabetWar("###"));
        assertEquals("a", AlphabetNuclearWar.alphabetWar("survivor#[a]"));
        assertEquals("", AlphabetNuclearWar.alphabetWar("boom###[a]")); //((#+)(\w+)|(\w+)(#+))(\[\w*\])
        assertEquals("aabcab", AlphabetNuclearWar.alphabetWar("shelters#[a][abc][ab]"));
        assertEquals("qwertyonetwo", AlphabetNuclearWar.alphabetWar("ab[qwerty]#[onetwo]"));
        assertEquals("qwertyabcd", AlphabetNuclearWar.alphabetWar("ab[qwerty]#[onetwo]#[abcd]"));
        assertEquals("", AlphabetNuclearWar.alphabetWar("##abde[fgh]ijk"));
        assertEquals("", AlphabetNuclearWar.alphabetWar("abde[fgh]ijk##"));
    }
    
    @Test
    public void expectingException(){
        assertThrows("None digit input was caught", IllegalArgumentException.class, () -> {
            testingDigits();
            fail();
        });
    }
    
    private static void testingDigits() throws IllegalArgumentException{ //everything should fail; use 2d arrays and than loop to assert
        String[] holder =
                {"1232",
                 "12324.sf31",
                 "12324#@1sf!"};
        
        for(int i = 0; i < holder.length; i++){
            
            try{
                AlphabetNuclearWar.alphabetWar(holder[i]);
                return;
            }
            catch(IllegalArgumentException e){
                if(i == (holder.length - 1)){
                    throw new IllegalArgumentException();
                }
            }
            
        }
    }
}