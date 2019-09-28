public class HiofFizzBuzz {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++ ){
            System.out.println(i);
        }
    }
    public static String parse( int n ){
        if( n == 3 ) return "Hi";
        if( n == 6 ) return "Hi";
        if( n == 5 ) return "Of";
        return String.valueOf(n);
    }
}
