public class PrePost {
    public static void main(String[] args) {
        int a = 5;
        //pre front 
        System.out.println(a);      //5
        System.out.println(++a);    //6
        System.out.println(a);      //6

        a = 5;
        System.out.println(a);      //5
        System.out.println(a++);    //5
        System.out.println(a);      //6

        //////////////////////////////////////////// 
        //post back
        b = 5;
        System.out.println(b);      //5
        System.out.println(--b);    //4
        System.out.println(b);      //4

        b = 5;
        System.out.println(b);      //5
        System.out.println(b--);    //5
        System.out.println(b);      //4
    }
}
