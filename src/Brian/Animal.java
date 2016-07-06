/**
 * 
 */
package Brian;

/**
 * @author BASKAR
 *
 */

import java.util.Comparator;

public class Animal {

	private String animalName;
	private String animalDesc;
	private int animalAge;

	public Animal(String animalName, String animalDesc, int animalAge) {
		super();
		this.animalName = animalName;
		this.animalDesc = animalDesc;
		this.animalAge = animalAge;
	}

	public static Comparator<Animal> AnimalNameComparator     = new Comparator<Animal>() {

		public int compare(Animal Animal1, Animal Animal2) {
		String strAnimalName1 = Animal1.getAnimalName.toUpperCase();
		String strAnimalName2 = Animal2.getAnimalName.toUpperCase();

		//ascending order
		return strAnimalName1.compareTo(strAnimalName2);
		
		//descending order
		//return strAnimalName2.compareTo(strAnimalName1);
}
	
	
	/**
	 * @return the animalName
	 */
	public String getAnimalName() {
		return animalName;
	}
	/**
	 * @param animalName the animalName to set
	 */
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	/**
	 * @return the animalDesc
	 */
	public String getAnimalDesc() {
		return animalDesc;
	}
	/**
	 * @param animalDesc the animalDesc to set
	 */
	public void setAnimalDesc(String animalDesc) {
		this.animalDesc = animalDesc;
	}
	/**
	 * @return the animalAge
	 */
	public int getAnimalAge() {
		return animalAge;
	}
	/**
	 * @param animalAge the animalAge to set
	 */
	public void setAnimalAge(int animalAge) {
		this.animalAge = animalAge;
	}
	
}
