package nested_classes_lambda;

public class Outer {
    public static void outerMethod() {
        System.out.println("Outer method");
    }

    public void printHello() {
        System.out.println("Hello World!");
    }

    public void testPrivateInnerClass() {
        PrivateInnerClass t = new PrivateInnerClass();
        t.privateMethod();
        t.publicMethod();
    }

    public static class InnerClass {
        public static void innerMethod() {
            System.out.println("Inner method");
        }
        public String secondInner() {
            return "Second inner class without static";
        }
    }

    private class PrivateInnerClass {
        public void publicMethod() {
            System.out.println("Public");
        }
        private void privateMethod() {
            System.out.println("Private");
        }
    }

    public class SecondInnerClass {
        public String secInnerMethod() {
            return "Second inner class -method";
        }
    }
}
