public class HiofFizzBuzz {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++ ){
            System.out.println( parse(i) );
        }
    }
    public static String parse( int n ){
        String result = "";
        if( n%3 == 0 ) result += "Hi";
        if( n%5 == 0 ) result += "Of";
        return result.length() > 0 ? result : String.valueOf(n);
    }
}
