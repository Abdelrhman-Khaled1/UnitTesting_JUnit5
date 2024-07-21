import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    Grader grader;

    @BeforeEach
    void init(){
        grader = new Grader();
    }

    @BeforeAll
    static void beforeAllInit(){
        System.out.println("This needs to run before all");
    }

    @Test
    void fiftyNineShouldReturnF() {
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD() {
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnC() {
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    void eightyNineShouldReturnB() {
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    void ninetyNineShouldReturnA() {
        assertEquals('A', grader.determineLetterGrade(99));
    }

    @Test
    void negativeOneShouldReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.determineLetterGrade(-1);
                }
        );
    }



    @Test
    public void testDetermineLetterGradeA() {
        Grader grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(95));
        assertEquals('A', grader.determineLetterGrade(90));
    }

    @Test
    public void testDetermineLetterGradeB() {
        Grader grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
        assertEquals('B', grader.determineLetterGrade(80));
    }

    @Test
    public void testDetermineLetterGradeC() {
        Grader grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
        assertEquals('C', grader.determineLetterGrade(70));
    }

    @Test
    public void testDetermineLetterGradeD() {
        Grader grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
        assertEquals('D', grader.determineLetterGrade(60));
    }

    @Test
    public void testDetermineLetterGradeF() {
        Grader grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
        assertEquals('F', grader.determineLetterGrade(0));
    }

    @Test
    public void testDetermineLetterGradeNegative() {
        Grader grader = new Grader();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            grader.determineLetterGrade(-1);
        });
        assertEquals("Number grade cannot be accepted", exception.getMessage());
    }




}