package AnimalZooProject;

import org.hibernate.Transaction;

import org.hibernate.Session;

public class ZooDao {

	private Session session;

	public ZooDao(Session session) {
		super();
		this.session = session;
	}

	public void createDb() {

		Cage cage1 = new Cage("One", "East");
		Cage cage2 = new Cage("Two", "West");
		Cage cage3 = new Cage("Three", "North");
		Cage cage4 = new Cage("Four", "South");

		Animal animal1 = new Animal("Tiger", 2);
		Animal animal2 = new Animal("Monkey", 5);
		Animal animal3 = new Animal("Swan", 11);
		Animal animal4 = new Animal("Elephant", 2);

		Category category1 = new Category("Mammals");
		Category category2 = new Category("Carnivorus");

		Supplier supplier1 = new Supplier("John Doe", "55-55-555", "Dream Land");
		Supplier supplier2 = new Supplier("John William", "66-66-666", "72 Park Avenue");

		FoodItem foodItem1 = new FoodItem("Wheat", 223);
		FoodItem foodItem2 = new FoodItem("Meat", 223);
		FoodItem foodItem3 = new FoodItem("Vegetable", 20);
		FoodItem foodItem4 = new FoodItem("Fruits", 200);

		// mapping

		/*
		 * cage1.setAnimal(animal1); animal1.setCage(cage1);
		 */
		
		animal1.addCage(cage1);

		/*
		 * cage2.setAnimal(animal2); animal2.setCage(cage2);
		 */
		
		animal2.addCage(cage2);

		/*
		 * cage3.setAnimal(animal3); animal3.setCage(cage3);
		 */
		
		animal3.addCage(cage3);

		/*
		 * cage4.setAnimal(animal4); animal4.setCage(cage4);
		 */
		
		animal4.addCage(cage4);

		category1.addAnimal(animal2);
		category1.addAnimal(animal4);
		category1.addAnimal(animal3);
		category2.addAnimal(animal1);

		supplier1.addFoodItem(foodItem1);
		supplier1.addFoodItem(foodItem2);

		supplier2.addFoodItem(foodItem3);
		supplier2.addFoodItem(foodItem4);

		animal1.getFoodItemList().add(foodItem2);
		foodItem2.getAnimalList().add(animal1);

		animal2.getFoodItemList().add(foodItem4);
		foodItem4.getAnimalList().add(animal2);

		animal3.getFoodItemList().add(foodItem3);
		foodItem3.getAnimalList().add(animal3);

		animal3.getFoodItemList().add(foodItem1);
		foodItem1.getAnimalList().add(animal3);

		animal4.getFoodItemList().add(foodItem3);
		foodItem3.getAnimalList().add(animal4);

		animal4.getFoodItemList().add(foodItem4);
		foodItem4.getAnimalList().add(animal4);

		Transaction tx = session.beginTransaction();

		session.persist(cage1);
		session.persist(cage2);
		session.persist(cage3);
		session.persist(cage4);

		session.persist(category1);
		session.persist(category2);

		session.persist(supplier1);
		session.persist(supplier2);

		tx.commit();
	}
}
