public class recursion {

        static int factorial(int n) {
            int result = 0;
            if (n == 1)
                return 1;
            else
                result = n * factorial(n - 1);
            return result;
        }

        public static void main(String[] args) {
            System.out.println("Factorial of 5 is: "+factorial(5));
        }
    }



    /*


    Explaination:


    int factorial(int n) {
            int result = 0;
            if (n == 1)
                return 1;
            else
                result = n * factorial(n - 1);
            return result;
        }


_______________________
   Here how it works:


    we want the Recursion of 5
    int factorial(int 5) {
            int result = 0;
            if (5 == 1)
                return 1;
            else                  24 ---------------------
                result = 5 * factorial(4);   <---(5-1)    |___> 5*24 => 120  // will be printed
            return result => 120;                                        ^
        }                                                                |
                                                                         |
        int factorial(int 4) {                                           |
            int result = 0;                                              |
            if (4 == 1)                                                  |
                return 1;                                                |
            else                  6 ---------------------                |
                result = 4 * factorial(3);   <---(4-1)   |____>   4*6 => 24
            return result => 24;                                         ^
        }                                                                |
                                                                         |
                                                                         |
        int factorial(int 3) {                                           |
            int result = 0;                                              |
            if (3 == 1)                                                  |
                return 1;                                                |
            else                 2 ----------------------                |
                result = 3 * factorial(2);   <---(3-1)  |___>     3*2 => 6
            return result => 6;                                           ^
        }                                                                 |
                                                                          |
        int factorial(int 2) {                                            |
            int result = 0;                                               |
            if (2 == 1)                                                   |
                return 1;                                                 |
            else                                                          |
                                  1  ----------------------               |
                result = 2 * factorial(1);   <---(2-1)    |______> 2*1 => 2
            return result => 2;         ^
        }                               |
                                        |
                                        |
        int factorial(int 1) {          |
            int result = 0;             |
            if (1 == 1)                 |
                return 1; --------------
            else   <----//it will not come here because 1 = 1
                result = n * factorial(n-1);
            return result;
        }


    main() {

  Print 120 <----
                 |
            factorial(5);  24 <----------  120
                 |                       |
                  ----------------> factorial(4);   6 <---------  24
                                         |                       |
                                          ---------------> factorial(3);   2<---------- 6
                                                                 |                     |
                                                                  --------------> factorial(2);  1<----------  2
                                                                                       |                     |
                                                                                        --------------> factorial(1);

        }


// The is called RECURSION (method calls itself).

     */




