package org.example;

public class MathUtility {
    //TEST CASE #1
        //VERIFY/GETFACTORIAL 90 WITH N = 0
        //STEP/PROCEDURE
        //(1) GIVE N WITH 0
        //(2) CALL GET FACTORIAL(N)

    //TEST CASE #2
        //VERIFY GETFACTORIAL() WITH N=5
        //STEP/PROCEDURE
        //(1)GIVE N WITH 5
        //(2) CALL GETFACTORIAL (N)

    //TEST CASE #3
        //VEIRY GETFACTORIAL () WITH N = 5
        //STEP / PROCEDURE

    //Code các test case để test hàm chạy đúng sai - thực hành tdd
    //😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊🤣🤣🤣🤣🤣🤣👍👍👍👍
    public static long getFactorial(int n){
        if (n < 0 || n > 20) {
            //return -1;
            throw new IllegalArgumentException("Invalid n , n must be between 0 and 20");
        }

        if (n==0){
            return 1;
        }
        //Khỏi viết else cho code nhìn đẹp
        //n bắt đầu từ 1
        //thuật toán con heo đất , nhân dồn , cộng dồn
        long result=1;
        for (int i =1;i<=n;i++){
            result*=i; //
        }
        return result;
    }

}
