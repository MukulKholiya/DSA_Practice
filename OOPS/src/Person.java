public class Person {
    private String name = "Mukul";
    private int age = 18;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){//throws Exception {// this throw tells method signature that may be exception can occur.
        try {
            if (age < 0) {
                throw new Exception("Baklol age negative nhi hota hai.....");//this throw generate exception
            }
            this.age = age;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("I am finally in block");
        }
    }
}
