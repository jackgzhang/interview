package weivretni.common;

class A {

    class B {
        // static int x; not allowed here
    }

    static class C {

        static int x; // allowed here
    }
}

public class InnerClass {

}
