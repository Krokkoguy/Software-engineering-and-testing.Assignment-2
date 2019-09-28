public class HiofFizzBuzz {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++ ){
            System.out.println( parse(i) + ", " + i );
        }
    }
    public static String parse( int n ){
        if( n%15 == 0 ) return "HiOf";
        if( n%3 == 0 ) return "Hi";
        if( n%5 == 0 ) return "Of";
        return String.valueOf(n);
    }
}
