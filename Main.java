public class Main {
    public static void main(String[] args) {

        Bird myBird=new Bird ();
        myBird.makesound();
        myBird.Fly();

        System.out.println();

        Animal myDog=new Dog();
        Animal myCat=new Cat();

        myDog.makesound();
        myCat.makesound();
    }
}
