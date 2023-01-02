import java.util.Stack;

public class stackTest {
    public static void main(String[] args) {



        Stack<Integer> marksStack = new Stack();
        marksStack.push(50);
        marksStack.push(60);
        marksStack.push(70);
        marksStack.push(80);

        System.out.println("Stack elements" + marksStack);

            System.out.println("POP: " + marksStack.pop());
        System.out.println("POP: " + marksStack.pop());




/*
        Stack<String> studentStack = new Stack();

        studentStack.push("Najat");
        studentStack.push("Amal");
        studentStack.push("Ahad");
        studentStack.push("Amna");

        System.out.println("Stack elements" + studentStack);
        while (!studentStack.isEmpty()){
            System.out.println("POP: " + studentStack.pop());
        }



*/




/*
        Stack<Integer> stk = new Stack();

        stk.push(1);
        stk.push(2);
        stk.push(3);

        System.out.println("elements in Stack: " + stk);
       System.out.println("POP element from Stack: " + stk.pop());
        System.out.println("POP element from Stack: " + stk.pop());
        System.out.println("POP element from Stack: " + stk.pop());

    }

*/
/*
        Map<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Marwa", 50);
        studentMarks.put("Shirin", 65);
        studentMarks.put("Rawdha", 80);
        studentMarks.put("Isra", 100);
        studentMarks.put("Dhikra", 95);

        studentMarks.remove("Isra");
        System.out.println("Mark of Student: "+ studentMarks.get("Isra"));






        Map<Integer, String>  menuMap = new HashMap<>();

        menuMap.put(1, "Enter name: ");
        menuMap.put(2, "Enter Subject: ");
        menuMap.put(3, "Enter mark: ");
        menuMap.put(4, "Enter Assigment number: ");
        menuMap.put(5, "Enter School name: ");

        menuMap.remove(5);

        System.out.println(menuMap.get(5));




 */




        // 1,1,3,4,4,4,,5,5
        // 1,3,4,5
/*

        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(20);
        integerSet.add(20);
        integerSet.add(20);
        integerSet.add(25);
        integerSet.add(25);
        integerSet.add(30);
        integerSet.add(30);
        integerSet.add(30);
        integerSet.add(30);

        for (Integer x: integerSet){
            System.out.println("value " + x );
        }



 */


/*

        Set<String> emailSet = new HashSet<>();
        Scanner sr=new Scanner(System.in);
        Boolean flag = Boolean.TRUE;

        while (flag) {
            System.out.println("Enter Email: ");
            String email = sr.next();
            emailSet.add(email);

            System.out.println("Please press 0 to exit, press 1 to continue");
            Integer inputFlag = (Integer) sr.nextInt();
            if (inputFlag == 0)
                flag = Boolean.FALSE;

        }
        System.out.println("Email Address: " + emailSet);



 */
    }
}
