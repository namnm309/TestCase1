package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MathUtilityTest {
    @Test
    public void testFactorialGivenRightArg1RunWell(){
        int n=1;
        long expectedResult=1;//Hy vọng 0 giai thừa ở trên là 1
        long actualvalue=MathUtility.getFactorial(n);//thực tế là mấy
        //So sánh giữa expected và autual
//        System.out.println("Expected: "+expectedResult+" , Actual: "+ actualvalue);
//        System.out.println("Status: "+(expectedResult == actualvalue));

        assertEquals(expectedResult,actualvalue);
    }

    //Test case with 2
    @Test
    public void testFactorialGivenRightArg2RunWell(){
            assertEquals(2,MathUtility.getFactorial(2));
        }

    //Test case with 4
    @Test
    public void testFactorialGivenRightArg4RunWell(){
        assertEquals(24,MathUtility.getFactorial(4));
    }




}