import java.util.LinkedList;

public class AnimalShelter {
    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0; // acts as a timestamp

    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;

        if (animal instanceof Dog) {
            dogs.addLast((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty()) {
            return dequeueCat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        }

        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if (dog.isOlderThan(cat)) {
            return dogs.poll();
        } else {
            return cats.poll();
        }
    }

    public Dog dequeueDog() {
        if (dogs.isEmpty()) {
            return null;
        }
        return dogs.poll();
    }

    public Cat dequeueCat() {
        if (cats.isEmpty()) {
            return null;
        }
        return cats.poll();
    }

    public void displayDogQueue() {
        LinkedList<String> queue = new LinkedList<>();
        for (Dog dog : dogs) {
            queue.add(dog.getName());
        }
        System.out.print("[");
        for (String dog : queue) {
            System.out.print(dog + ", ");
        }
        System.out.println("]");
    }

    public void displayCatQueue() {
        LinkedList<String> queue = new LinkedList<>();
        for (Cat cat : cats) {
            queue.add(cat.getName());
        }
        System.out.print("[");
        for (String cat : queue) {
            System.out.print(cat + ", ");
        }
        System.out.println("]");
    }
}
