public class Main {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();

        animalShelter.enqueue(new Dog("Dog1"));
        animalShelter.enqueue(new Cat("Cat1"));
        animalShelter.enqueue(new Dog("Dog2"));
        animalShelter.enqueue(new Cat("Cat2"));

        animalShelter.displayDogQueue();
        animalShelter.displayCatQueue();

        System.out.println("Dequeue Any: " + animalShelter.dequeueAny().getName());
        animalShelter.enqueue(new Cat("Cat3"));
        animalShelter.displayCatQueue();
        System.out.println("Dequeue Dog: " + animalShelter.dequeueDog().getName());
        System.out.println("Dequeue Cat: " + animalShelter.dequeueCat().getName());
        System.out.println("Dequeue Any: " + animalShelter.dequeueAny().getName());
        System.out.println("Dequeue Dog: " + animalShelter.dequeueDog());
        System.out.println("Dequeue Cat: " + animalShelter.dequeueCat().getName());
    }


    // An animal shelter, which holds only dogs and cats, operates on a strictly
// "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of
//  all animals at the shelter, or they can select whether they would
//  prefer a dog or a cat (and will receive the oldest animal of that type).
//   They cannot select which specific animal they would like.
//   Create the data structures to maintain this system and implement
//   operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.
}
