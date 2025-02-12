import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   @Test
   @DisplayName("")
   void pluralizeTest1() {
     Class<?> testClass = {CLASS_NAME}.class;
     try {
       cArg=[String.class]
       Method method = testClass.getDeclaredMethod("pluralize", cArg);
       assertEquals("ies", method.invoke(null, "fly"));

   }
   
     catch (NoSuchMethodException e) {
       fail("Method does not exist");
   }
}
}
