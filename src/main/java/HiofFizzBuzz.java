public class HiofFizzBuzz {

    /* ## Deloppgave 1 ## */
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++ ){
            System.out.println( parse(i) );
        }
    }

    public static String parse( int n ){
        if( n <= 0 ) throw new TooNegativeException();
        String result = "";
        if( n%3 == 0 ) result += "Hi";
        if( n%5 == 0 ) result += "Of";
        return result.length() > 0 ? result : String.valueOf(n);
    }

    public static class TooNegativeException extends IllegalArgumentException {
    }
}
