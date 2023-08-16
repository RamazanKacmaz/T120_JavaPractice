package practice_day08;

public class ImmutableClass {

    public final class ImmutableExamle {
        public  final String message;


        public ImmutableExamle(String message) {
            this.message = message;
        }

        public String getMessage(){
            return message;
        }
    }

    public static void main(String[] args) {

    }

}
