package challenges.stackAndQueue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class bracketsTest {
@Test void bracketsBalance(){
    Brackets brackets=new Brackets();

    //checking different cases
    assertEquals(true,brackets.bracketsBalance("{}"),"this should return 'true'");
    assertEquals(true,brackets.bracketsBalance("{}(){}"),"this should return 'true'");
    assertEquals(true,brackets.bracketsBalance("()[[Extra Characters]]"),"this should return 'true'");
    assertEquals(true,brackets.bracketsBalance("(){}[[]]"),"this should return 'true'");
    assertEquals(true,brackets.bracketsBalance("{}{Code}[Fellows](())"),"this should return 'true'");
    assertEquals(false,brackets.bracketsBalance("[({}]"),"this should return 'false'");
    assertEquals(false,brackets.bracketsBalance("(]("),"this should return 'false'");
    assertEquals(false,brackets.bracketsBalance("{(})"),"this should return 'false'");

}
}
