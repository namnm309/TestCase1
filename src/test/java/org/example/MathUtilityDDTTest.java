package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import javax.management.ConstructorParameters;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //Chuẩn bị 1 mảng 2 chiều chứa data đưa vào test hàm getFunctione của mình
    //Hàm này phải là static - nằm 1 chỗ cố định trong ram để cung cấp data cho các hàm test
    public static Object[][] initData(){
        return new Object[][] {
                {0,1},
                {1,1},
                {2,2},
                {3,6},
                {4,24},
                {5,120},
                {6,720},
        };
    }


    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgRunsWell(int n, long expectedResult){
        assertEquals(expectedResult, MathUtility.getFactorial(n));
    }


}