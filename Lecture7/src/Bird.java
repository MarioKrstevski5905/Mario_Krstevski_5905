public class Bird implements Animal{
    @Override
    public void sleep(){
        System.out.println("The bird sleeps in the nest");
    }
    @Override
    public void move(){
        System.out.println("The bird flies gracefully through the sky");
    }
    @Override
    public void sound(){
        System.out.println("The bird sings");
    }
}
