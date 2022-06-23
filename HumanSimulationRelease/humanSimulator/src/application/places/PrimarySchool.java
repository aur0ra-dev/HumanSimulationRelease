package application.places;

import application.human.fromHuman.Classmate;
import application.human.fromHuman.MainCharacter;
import application.human.fromHuman.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Klasa reprezentujaca placowke edukacyjna - Szkole podstawowa
 */
public class PrimarySchool {
    Random random = new Random();
    public int numberOfClassmates = 20 + random.nextInt(6);
    public List<Classmate> listOfClassmates = new ArrayList<>();
    public List <Teacher> listOfTeachers = new ArrayList<>();
    public int levelOfEducation;
    public int wealthOfPlace;
    public int prestigeOfPlace;

    /**
     *  Modyfikuje pola obiektu klasa MainCharaceter w zaleznosci od pol klasy
     * @param mainCharacter przyjmuje obiekt klasy MainCharaceter
     * @return zwraca obiekt klasy MainCharaceter
     */
    public MainCharacter sendKidToContest(MainCharacter mainCharacter){

        mainCharacter.bonusesToEarnings+=((levelOfEducation+wealthOfPlace+prestigeOfPlace)+random.nextInt(25)+1)*100;

        return mainCharacter;
    }

    /**
     * Inicjalizuje wartosci pola klasy w zaleznosci pol obiektu klasy MainCharacter i polacznym z nich obiektow klasy Mother i Father
     * @param mainCharacter przyjmuje jako parametr obiekt klasy MainCharacter
     */
    public void initializePlace (MainCharacter mainCharacter) {
        prestigeOfPlace=(mainCharacter.father.intelligence+mainCharacter.mother.intelligence)/90+mainCharacter.intelligence/60;
        levelOfEducation=(mainCharacter.father.wisdom+mainCharacter.mother.wisdom)/250+mainCharacter.wisdom/100;
        wealthOfPlace=(mainCharacter.father.earnings+mainCharacter.mother.earnings)/4000;
        for(int g = 0; g < 3; g++){
            listOfTeachers.add(new Teacher());
        }
    }

}
