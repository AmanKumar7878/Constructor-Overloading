class student {
    int rollno;
    String name;

    student() {
        rollno = 10;
        name = "aman";
    }

    student(int r, String n) {
        rollno = r;
        name = n;
    }

    public void display() {
        System.out.println(rollno);
        System.out.println(name);
    }
}
    public class ConstructorOverloading{
        public static void main(String[] args) {

            student obj2 = new student(15, "ram");
            obj2.display();

        }
    }


