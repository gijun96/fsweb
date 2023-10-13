package a1013;

     class Printer {
         private static Printer printer = new Printer();
         int num;
    boolean rel;
    double d;
    String str;
    public void println(int a){
        System.out.println(a);
    }
    public void println(boolean r){
        System.out.println(r);
    }
    public void println(double a){
        System.out.println(a);
    }
    public void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}
