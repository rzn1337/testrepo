public class Main {
    public static void main(String[] args) {

        long totalMilliseconds = System.currentTimeMillis();

        long timeinsecs = totalMilliseconds/1000;

        long secs = ((timeinsecs)%60);

        long mins = ((timeinsecs/60)%60);

        long hrs = ((timeinsecs/3600)%24);

        System.out.println(hrs+":"+mins+":"+secs);
    }
}