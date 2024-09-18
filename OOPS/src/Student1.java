public class Student1 {
    // access modifier.
    private String name = "Mukul";
    private int age = 19;

    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    // constructor
    public Student1(){

    }
    // parameteirsed constructor
    public Student1(String name,int age){
        this.name=name;
        this.age=age;
    }
}
