package weivretni.common;

interface Contents {

    int value();
}

class Wrapping {

    private int i;

    public Wrapping(int x) {
        i = x;
    }

    public int value() {
        return i;
    }
}

public class AnonymouseClass {

    public Contents cont() {
        return new Contents() {

            private int i = 11;

            public int value() {
                return i;
            }
        }; // Semicolon required in this case
    }

    public Wrapping wrap(int x) {
        // Base constructor call:
        return new Wrapping(x) {

            public int value() {
                return super.value() * 47;
            }
        }; // Semicolon required
    }

    public static void main(String[] args) {
        AnonymouseClass p = new AnonymouseClass();
        Contents c = p.cont();
        Wrapping w = p.wrap(1);
    }
}
