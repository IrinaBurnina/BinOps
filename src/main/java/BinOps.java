public class BinOps {
    public String sum(String a, String b) {
        return deParser((parser(a) + parser(b)));
    }

    public String mult(String a, String b) {
        return deParser(parser(a) * parser(b));
    }

    public int parser(String c) {
        return Integer.parseInt(c, 2);
    }

    public String deParser(int d) {
        return Integer.toBinaryString(d);
    }
}
