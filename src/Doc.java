public class Doc {
   private static int number;

    public Doc() {
        number++;
   }
}

class DocTest{
    public static void main(String[] args) {
        Doc d = new Doc();
        Doc ddd= new Doc();
        Doc dd= new Doc();
//        System.out.println();
    }
}