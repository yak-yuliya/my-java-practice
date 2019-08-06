import java.security.Permission;
import java.util.Scanner;

public class MainIntegerToString {
    public static void main(String[] args) {
        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

            //pack1
            //String s=???; Complete this line below
            String s = Integer.toString(n);

            //2
            String k = String.valueOf(n);

            //3
            String l = "" + n;

            if (n == Integer.parseInt(k)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
