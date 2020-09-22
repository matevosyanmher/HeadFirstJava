public class GC {
    public static GC doStuff() {
        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }

    public static void main(String[] args) {
//        GC  copyGC;
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();

//        copyGC = null;
//        gc2 = null;
//        newGC = gc3;
//        gc1 = null;
//        newGC = null;
        gc4 = null; //GC չի աշխատի, որովհետև gc4 - ը հղում է gc3-ի օբյեկտին, որի նուլլ որժեքի դեպքում դեռ այդ օբյեկտն ունի հղում gc3
//        gc3 = gc2;
//        gc1 = gc4;
        gc3 = null;
    }

    public static void doStuff2(GC copyGC) {
        GC localGC;
    }
}