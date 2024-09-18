
public class Student {
    public static void main(String[] args) {
        Intro s = new Intro();
        s.name = "Mukul";
        s.age = 19;
        System.out.println(s.name);
        System.out.println(s.age);
        s.Intro_Yourself();
        Intro s1 = new Intro();
        s1.name = "Kholiya";
        s1.age = 19;
        s1.Intro_Yourself();
        s1.sayHi("Mukul");
        s1.Mentor();
    }

}
