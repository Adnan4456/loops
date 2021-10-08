
package nest;

// Enclosing Class
public class EnclosingClass {
    // instance field on enclosing class
    public String outerName = "outer";

    // static field on enclosing class
    public static String staticOuterName = "OUTER";

    // static method on enclosing class
    public static void doSomethingStatically() {
        System.out.println("doSomethingStatically invoked.");
        // invoke nested class's method via class reference
        NestedStaticClass.getStaticName();
    }

    // instance method on enclosing class
    public void doSomethingOnInstance() {
        System.out.println("doSomethingOnInstance invoked.");
        // invoke nested class's method via instance reference
        //it is non static method.
        new NestedStaticClass().getInstanceName();
        NestedStaticClass.getStaticName();
    }

    // Begin declaration of static nested class named NestedStaticClass
    public static class NestedStaticClass {
        // static field
        public static String staticName = "NestedStaticClass.staticName";

        // instance field
        public String instanceName = "NestedStaticClass.instanceName";

        // static method
        public static String getStaticName() {
            return "getStaticName() = " + NestedStaticClass.staticName;
        }

        // instance method
        public String getInstanceName() {
            System.out.println(staticOuterName);
            //compler error. because non static instance variable is calling from static class.
            //even it is inner class.
//            System.out.println(outerName);
            return "getInstanceName() = " + this.instanceName;
        }

        public enum Colors {
            RED, BLUE, YELLOW
        }

        public interface NestedInterface {

        }
    }  // Ends declaration of the static nested class

}

// This class tests the EnclosingClass and it's nested class
// from disassociated class.
class TestEnclosingClass {

    public static void main(String[] args) {
        // Reference static field on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.staticName);

        // Reference static method on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.getStaticName());

        // Reference enum on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.Colors.BLUE);

        // Local variable declaration using a nested class's interface
        EnclosingClass.NestedStaticClass.NestedInterface n;

        EnclosingClass c = new EnclosingClass();
        c.doSomethingOnInstance();
    }
}