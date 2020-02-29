package pl.sda.zajęcia7;

public class String_dzielenie_wyrazow {
    public static void main(String[] args) {
        String a = "Bardzo lubię uczyć się Javy, ale czasami wolę: JavaScript. Pythona, Scale.";

        String[] b = new String[50];
        b = a.split("[ .,:]+");
        a = a.replaceAll("a", "@");
        System.out.println(a);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
}

}
