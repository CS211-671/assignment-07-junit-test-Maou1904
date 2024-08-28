package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList sl1;

    @BeforeEach
    void init(){
        sl1 = new StudentList();
        sl1.addNewStudent("6xxxxx234","Neo");
    }

    @Test
    @DisplayName("Adding Student to StudentList")
    void addNewStudent(){
        sl1.addNewStudent("6xxxxx235","Mek");
        assertNotNull(sl1.findStudentById("6xxxxx235"));
    }

    @Test
    @DisplayName("Finding Student in StudentList")
    void testFindStudentById(){
        assertEquals("6xxxxx234",sl1.findStudentById("6xxxxx234").getId());
    }

    @Test
    @DisplayName("Give Score to Student in StudentList")
    void testGiveScoreToId(){
        sl1.giveScoreToId("6xxxxx234",35);
        assertEquals(35,sl1.findStudentById("6xxxxx234").getScore());
    }

    @Test
    @DisplayName("Showing Grade of Student in StudentList")
    void viewGradeOfId(){
        sl1.giveScoreToId("6xxxxx234",35);
        assertEquals("F",sl1.viewGradeOfId("6xxxxx234"));
    }

}