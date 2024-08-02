public class DemoDIvideByZero {
    public static void main(String[] args) {
        int amount = 0;
        System.out.println(divide(10, 3)); // 3

        // Approach 1
        if (amount != 0) {  
        System.out.println(divide(10, amount)); // java.lang.ArithmeticException: / by zero
        } else {
            System.out.println(0);
        }

        // Approach 2
        // Handle Exception
        // Unchecked Exception (Runtime Exception) - Implicitly
        try{
            divide(10, amount);
            // ... lines of code...
            String s = "hello";
            System.out.println(s.charAt(2)); // l
            s = null;
            System.out.println(s.charAt(2)); // NullPointerException
        } catch (ArithmeticException e) {
            // send email to teammate..
            // insert to database...
            // or 
            System.out.println("hello! Divided by Zero:" + 10 + "/" + amount);
        } catch (NullPointerException e) {
            System.out.println("NPE: Please check.");
        }
        // Only will should one exception in one try, then exit

        // Approach 2
        try {
            double averageExpense = CalculateExpensePerEmployee2();
        } catch (ArithmeticException e) {
            System.out.println("somthing to fix...");
        }

        // Approach 1
        double expense = CalculateExpensePerEmployee();
        // main() -> CalculateExpensePerEmployee() -> getDepartmentExpense() & getEmployeeCount()
        // getEmpolyeeCount()

        // Approach 3
        // more specify the exception happened
        try {
            CalculateExpensePerEmployee3();
        } catch (EmployeeCountZeroException e) {
            // specific handing for employee count = 0 ...

        }

    }

    // return int (MUST)
    // throw ArithmeticException(Implicitly) (Exception)
    public static int divide(int x, int y) {
        return x / y;
    }

    // Approach 1
    public static int CalculateExpensePerEmployee() {
        try {
        return getDepartmentExpense() / getEmployeeCount(); // bug
        } catch (ArithmeticException e) {
            return getDepartmentExpense(); // fix
        }
    }

    // Approach 2
    // When a method throw unchecked exception without handling, the exception will be thrown back to caller.
    public static int CalculateExpensePerEmployee2() {
        return getDepartmentExpense() / getEmployeeCount(); // bug
        }

    // Approach 3
    public static int CalculateExpensePerEmployee3() {
        try {
        return getDepartmentExpense() / getEmployeeCount(); // bug
        } catch (ArithmeticException e) {
            throw new EmployeeCountZeroException();
        }
        }

    public static int getEmployeeCount() {
        return 0;
    }

    public static int getDepartmentExpense() {
        return 140000;
    }


}
