package org.example;

public class Main {
    public static void main(String[] args) {
        //Tét n = 1
        testFactorialGivenRightArg0RunWell();
        //Tét n = 5
        testFactorialGivenRightArg3RunWell();

        testFactorialGivenWrongArgMinus2ThrowsExcepiton();
    }

    //Code các test case để test hàm chạy đúng sai-thực hành TDDp
    //Hàm này ứng với 1 test case , test case với N - 0 hàm trả về ngon
    //Tên hàm mang ý nghĩa test case luôn , để giúp dân dev kiểm tra tính thiếu đủ các test case => tránh nghịch lí thuốc trừ sâu


    public static void testFactorialGivenRightArg0RunWell(){
        int n=0;
        long expectedResult=1;//Hy vọng 0 giai thừa ở trên là 1
        long actualvalue=MathUtility.getFactorial(n);//thực tế là mấy
        //So sánh giữa expected và autual
        System.out.println("Expected: "+expectedResult+" , Actual: "+ actualvalue);
        System.out.println("Status: "+(expectedResult == actualvalue));
    }

//    public static void testFactorialGivenRightArg1RunWell(){
//        int n=1;
//        long expectedResult=1;//Hy vọng 0 giai thừa ở trên là 1
//        long actualvalue=MathUtility.getFactorial(n);//thực tế là mấy
//        //So sánh giữa expected và autual
//        System.out.println("Expected: "+expectedResult+" , Actual: "+ actualvalue);
//        System.out.println("Status: "+(expectedResult == actualvalue));
//    }

    public static void testFactorialGivenRightArg2RunWell(){
        int n=5;
        long expectedResult=120;//Hy vọng 0 giai thừa ở trên là 1
        long actualvalue=MathUtility.getFactorial(n);//thực tế là mấy
        //So sánh giữa expected và autual
        System.out.println("Expected: "+expectedResult+" , Actual: "+ actualvalue);
        System.out.println("Status: "+(expectedResult == actualvalue));
    }

    public static void testFactorialGivenRightArg3RunWell(){
        int n=1;
        long expectedResult=1;//Hy vọng 0 giai thừa ở trên là 1
        long actualvalue=MathUtility.getFactorial(n);//thực tế là mấy
        //So sánh giữa expected và autual
        System.out.println("Expected: "+expectedResult+" , Actual: "+ actualvalue);
        System.out.println("Status: "+(expectedResult == actualvalue));
    }

    public static void testFactorialGivenRightArg5RunWell(){
        int n=1;
        long expectedResult=1;//Hy vọng 0 giai thừa ở trên là 1
        long actualvalue=MathUtility.getFactorial(n);//thực tế là mấy
        //So sánh giữa expected và autual
        System.out.println("Expected: "+expectedResult+" , Actual: "+ actualvalue);
        System.out.println("Status: "+(expectedResult == actualvalue));
    }

    //Test giai thừa vói âm 2 : hy vọng 1 ngoại lệ xuất hiện
    public static void testFactorialGivenWrongArgMinus2ThrowsExcepiton(){
        MathUtility.getFactorial(-2);
    }


}