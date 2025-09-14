package oops;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}



public class Inheritanceeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.sound();

	}

}
