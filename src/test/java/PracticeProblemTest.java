import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
public class PracticeProblemTest {
@Test
@DisplayName("")
void pluralizeTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("pluralize", cArg);
  
    assertEquals("ies", (String)method.invoke(null, "fly"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void pluralizeTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("pluralize", cArg);
  // Enter code here
    assertEquals("eys", (String)method.invoke(null, "hey"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void pluralizeTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("pluralize", cArg);
  // Enter code here
    assertEquals("ives", (String)method.invoke(null, "life"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void pluralizeTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("pluralize", cArg);
  // Enter code here
    assertEquals("s", (String)method.invoke(null, "anything else"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void pluralizeTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("pluralize", cArg);
  // Enter code here
    assertEquals("ies", (String)method.invoke(null, "y"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void pluralizeTest6() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("pluralize", cArg);
  // Enter code here
    assertEquals("eys", (String)method.invoke(null, "ey"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void pluralizeTest7() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("pluralize", cArg);
  // Enter code here
    assertEquals("ives", (String)method.invoke(null, "ife"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void pluralizeTest8() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("pluralize", cArg);
  // Enter code here
    assertEquals("s", (String)method.invoke(null, ""));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void pluralizeTest9() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("pluralize", cArg);
  // Enter code here
    assertEquals("ies", (String)method.invoke(null, "flY"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void pluralizeTest10() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("pluralize", cArg);
  // Enter code here
    assertEquals("s", (String)method.invoke(null, "eyives"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void minTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class, int.class};
        Method method = testClass.getDeclaredMethod("min", cArg);
  // Enter code here
    assertEquals(1, (int)method.invoke(null, 1, 2, 3));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void minTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, assertEquals(-3,.class, int.class};
        Method method = testClass.getDeclaredMethod("min", cArg);
  // Enter code here
    assertEquals(-3, (assertEquals(-3,)method.invoke(null, 1, -3, 14));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void minTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class, int.class, int.class};
        Method method = testClass.getDeclaredMethod("min", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, 300, 15, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void isLeapYearTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
  // Enter code here
    assertEquals(true, (boolean)method.invoke(null, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void isLeapYearTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
  // Enter code here
    assertEquals(false, (boolean)method.invoke(null, 100));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void isLeapYearTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
  // Enter code here
    assertEquals(false, (boolean)method.invoke(null, 200));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void isLeapYearTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
  // Enter code here
    assertEquals(true, (boolean)method.invoke(null, 400));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void isLeapYearTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
  // Enter code here
    assertEquals(true, (boolean)method.invoke(null, 800));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void isLeapYearTest6() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
  // Enter code here
    assertEquals(true, (boolean)method.invoke(null, 1996));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
@Test
@DisplayName("")
void isLeapYearTest7() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("isLeapYear", cArg);
  // Enter code here
    assertEquals(true, (boolean)method.invoke(null, 4));
}

}
    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
}
}
