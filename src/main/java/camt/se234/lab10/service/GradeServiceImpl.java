package camt.se234.lab10.service;

import camt.se234.lab10.entity.Grade;

public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
        if (score > 79.5) {
            return "A";
        }
        else if (score > 74.5){
            return "B";
        }else if (score > 59.5){
            return "C";
        }else if (score > 32.5) {
            return "D";
        } else
            return "F";

    }
    public Object paramsForTestGetGradeParams() {
    	return new Object[][] {
    		{100,"A"},
    		{77,"B"}
    	};
    }
    public String getGrade(double midtermScore, double finalScore) {
     double total = midtermScore+finalScore;
     if(total>80)
    	 return "A";
     if(total>70)
    	 return "B";
     if(total>60)
    	 return "C";
     if(total>50)
    	 return "D";
     if(total<50)
    	 return "F";
    return "F";
    
    }
}
