package problems;

import java.util.LinkedList;

import DataStructures.Animal;

public class AnimalShelter {
	LinkedList<Animal> animalQueue;

	public AnimalShelter() {
		animalQueue = new LinkedList<Animal>();
	}

	public void enqueue(Animal animal) {
		animalQueue.add(animal);
	}

	public Animal dequeueAny() {
		return animalQueue.removeFirst();
	}

	public Animal dequeueDog() {
		return getAnimal(Animal.DOG);
	}

	public Animal dequeueCat() {
		return getAnimal(Animal.CAT);
	}

	private Animal getAnimal(String animalType) {
		int index = 0;
		while (index < animalQueue.size() && animalQueue.get(index).getType() != animalType) {
			index++;
		}

		if (index < animalQueue.size())
			return animalQueue.remove(index);
		else
			return null;
	}
}
