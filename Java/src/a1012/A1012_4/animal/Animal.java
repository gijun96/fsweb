package a1012.A1012_4.animal;

    class Animal {

        void makeSound() {
            System.out.println("동물의 소리를 냅니다.");
        }
    }
        class Dog extends Animal{
            @Override
            void makeSound(){
                System.out.println("멍멍!!");
            }
        }
        class Cat extends Animal{
            @Override
            void makeSound(){
                System.out.println("야옹!!");
            }
        }

