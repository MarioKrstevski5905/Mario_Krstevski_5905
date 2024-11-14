public class Fish implements Animal {
    @Override
    public void sleep(){
        System.out.println("The fish rests deep in the water");
    }
    @Override
    public void move(){
        System.out.println("The fish swims gracefully in the ocean");
    }
    @Override
    public void sound(){
        System.out.println("Fish bubbling!");
    }

}
