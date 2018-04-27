package camt.se234.lab10.service;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;

import org.junit.Test;

import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(JUnitParamsRunner.class)
public class GradeServiceImplTest {
    @Test
    public void testGetGrade(){
        GradeServiceImpl gradeService = new GradeServiceImpl();
        assertThat(gradeService.getGrade(100),is("A"));
        assertThat(gradeService.getGrade(80),is("A"));
        assertThat(gradeService.getGrade(78.9),is("B"));
        assertThat(gradeService.getGrade(75),is("B"));
        assertThat(gradeService.getGrade(74.4),is("C"));
        assertThat(gradeService.getGrade(60),is("C"));
        assertThat(gradeService.getGrade(59.4),is("D"));
        assertThat(gradeService.getGrade(33),is("D"));
        assertThat(gradeService.getGrade(32),is("F"));
        assertThat(gradeService.getGrade(0),is("F"));
        
        assertThat(gradeService.getGrade(32.2,32.1),is("C"));
        assertThat(gradeService.getGrade(22.1,30.3),is("D"));
        assertThat(gradeService.getGrade(49.5,40.0),is("A"));
        assertThat(gradeService.getGrade(10.0,15.0),is("F"));
        assertThat(gradeService.getGrade(35.6,36.5),is("B"));
        

    }
//    @Test
//    @Parameters(method = "paramsForTestGetGradeParams")
//  @TestCaseName("Test getGrade Params [{index}] : input is {0}, expect \"{1}\"")
//    public void testGetGradeparams(double score, String expectedGrade) {
//    	GradeServiceImpl gradeService = new GradeServiceImpl();
//    	assertThat(gradeService.getGrade(score),is(expectedGrade));
//    }
   
   
    
}
