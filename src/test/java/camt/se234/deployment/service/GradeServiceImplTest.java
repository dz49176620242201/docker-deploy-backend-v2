package camt.se234.deployment.service;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class GradeServiceImplTest {
    @Test
    public void testGetGrade(){
        GradeServiceImpl gradeService = new GradeServiceImpl();
        assertThat(gradeService.getGrade(100),is("A"));
        assertThat(gradeService.getGrade(89),is("B"));
        assertThat(gradeService.getGrade(80),is("B"));
        assertThat(gradeService.getGrade(79.4),is("C"));
        assertThat(gradeService.getGrade(70),is("C"));
        assertThat(gradeService.getGrade(69.4),is("D"));
        assertThat(gradeService.getGrade(50),is("D"));
        assertThat(gradeService.getGrade(49),is("F"));
        assertThat(gradeService.getGrade(0),is("F"));

    }

}
