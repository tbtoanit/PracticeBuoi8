package KeThua;

public class Animal implements IAnimal, IAnimal1, IAnimal2 {
    String name;
    int age;

    @Override
     public void an(){
        System.out.println("Animal eat...!");
    }

    @Override
    public void ngu(){
        System.out.println("Animal sleep...!");
    }

    @Override
    public void diSanMoi() {

    }

    @Override
    public void tinhSoChan(){

    }

    @Override
    public void cachSanMoi(){

    }
}
