public class exceptions {

        public static void main(String[] args) {
        /*    int a = 10, b = 15, c = 5, result;
            try {
                result = a / (b - c);
                System.out.println("result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught:Division by zero");
            } finally {
                System.out.println("I am in final block");
            }
        }


         */


            // This is a caller function



                try {
                    fun();
                } catch (Exception e) {
                    System.out.println("General Exception: " + e.getMessage());
                }
            }


            // This method throws an exception
            // to be handled
            // by caller or caller
            // of caller and so on.
            static void fun () throws Exception {
                System.out.println("Inside fun(). ");

                //if current balance < asked amount
                throw new Exception("Not enough balance");
            }


        }



