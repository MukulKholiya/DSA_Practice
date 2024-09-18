public class Student_Client {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1("mukul",19);
//        System.out.println(s2.name);// showing error as name is now private.
//        s2.age=90;
        s2.setName("rahul");
        System.out.println(s2.getName());
    }
}
