package practice_day08;

public class passByValue {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Merhaba");
        System.out.println(text);
        modify(text);
    }

    public static void modify(StringBuilder str) {
        str.append("Java");
        System.out.println(str);
    }

}
