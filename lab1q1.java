// public class lab1q1{
//     abstract class num{
//         abstract  void maths();
//         void phy(){
//             System.out.println("not showing");
//         }
//     }
//     public class stu1 extends num{
//         void maths(){
//             System.out.println("90");
//         }
//     }
//     public class stu2 extends num{
//         void maths(){
//             System.out.println("96");
//         }
//     }

//     public static void main(String[] args) {
//         stu2 obj = new stu2();
//         stu1 obj1 = new stu1();

//     }

// }
public class lab1q1 {
    abstract static class num {
        abstract void maths();
        void phy() {
            System.out.println("not showing");
        }
    }

    public static class stu1 extends num {
        void maths() {
            System.out.println("90");
        }
    }

    public static class stu2 extends num {
        void maths() {
            System.out.println("96");
        }
    }

    public static void main(String[] args) {
        stu2 obj = new stu2();
        stu1 obj1 = new stu1();

        obj.maths();  // Will print 96
        obj1.maths(); // Will print 90
    }
}
