package a1013.animal;

public class AbstractMethodExample{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breath();
        dog.sound();
        Cat cat = new Cat();
        cat.breath();
        cat.sound();
        System.out.println("======================================");
        //매개변수의 다형성
        animalSound(new Dog());
        animalSound(new Cat());
    }
        public static void animalSound(Animal animal){
            animal.breath();
            animal.sound();
        }

}
