class TextBox {
    Integer i;
    int j;

    public static void main(String[] args) {
        TextBox t = new TextBox();
        t.go();
    }

    private void go() {
        i = j;
        System.out.println(i);
        System.out.println(j);
//        Integer.parseInt("1");
//        boolean b = Boolean.TRUE;
//        boolean b = new Boolean("true").booleanValue();
    }
}
