public class The_while {
    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("---------------------");
        int i=0 ;
        while(i<names.length) {
            System.out.println(i+": "+names[i]);
            i++;

        }

        System.out.println("---------------------");
        int ii = names.length;
        while (ii > 0) {
            ii--;
            System.out.println(ii + ": " + names[ii]);
        }

        System.out.println("---------------------");
        int iii = names.length - 1;
        while (iii >= 0) {
            System.out.println(iii + ": " + names[iii]);
            iii--;
        }
    }
}