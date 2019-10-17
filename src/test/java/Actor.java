public class Actor {
    String name;
    String lastname;
    int age;



    public Actor(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public Actor() {

    }

    void play(){
        System.out.println("It is playing now");

    }
    void act(){
        System.out.println("it is acting now");

    }

    void retire(){
        System.out.println("It is retiring now");

    }

}
