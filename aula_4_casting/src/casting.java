public class casting {

    public static void main(String[] args){

        System.out.println("Upcast");
        upcast();

        System.out.println("Downcast");
        downcast();

    }

    private static void upcast(){

        short s;
        byte b = 127;
        s = b;
        System.out.println("s: " + s);

        int i;
        short s1 = 32767;
        i = s1;
        System.out.println("i: " + i);

        long l;
        int i1 = 10;
        l = i1;
        System.out.println("l: " + l);

        float f;
        int i2 = 150;
        f = i2;
        System.out.println("f: " + f);

        double d;
        float f1 = 3.5f;
        d = f1;
        System.out.println("d: " + d);

    }

    private static void downcast(){

        byte b;
        short s = 200;
        b = (byte) s;
        System.out.println("b: " + b);

        short s1;
        int i = 35000;
        s1 = (short) i;
        System.out.println("s1: " + s1);

        int i1;
        long l = 100;
        i1 = (int)l;
        System.out.println("i1: " + i1);

        int i2;
        float f = 32.54f;
        i2 = (int) f;
        System.out.println("i2: " + i2);

        float f1;
        double d = 35.5333333333333333333333333333333333d;
        f1 = (float) d;
        System.out.println("f1: " + f1);

    }

}
