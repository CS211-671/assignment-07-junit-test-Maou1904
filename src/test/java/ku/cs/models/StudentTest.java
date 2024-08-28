package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StudentTest {
    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("6xxxxxxxx","Neo");
    }
    @Test
    @DisplayName("Adding Score")
    void testAddScore(){
        s1.addScore(40);
        assertEquals(40,s1.getScore()); // เช็คว่าเท่ากันไหม (expect,actual)
        s1.addScore(30);
        assertEquals(70,s1.getScore());
    }

    @Test
    @DisplayName("Grade Calculating")
    void testCalculateGrade(){
        s1.addScore(60);
        assertEquals("C",s1.grade());
    }

    @Test
    @DisplayName("Finding ID")
    void testFindId(){
        assertEquals("6xxxxxxxx",s1.getId());
    }

    @Test
    @DisplayName("Renaming")
    void testChangeName(){
        s1.changeName("Mek");
        assertEquals("Mek",s1.getName());
    }

}