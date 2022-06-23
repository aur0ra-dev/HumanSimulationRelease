package application.places;

import application.human.fromHuman.MainCharacter;
import application.human.fromHuman.Teacher;

import java.util.List;

abstract public  class EducationPlaces {
     public int levelOfEducation;
     public int wealthOfPlace;
     public int prestigeOfPlace;

    /**
     *
     * @param mainCharacter przujmuje obiekt plasy
     * @param n
     * @param teachers
     */
    public void initializePlace (MainCharacter mainCharacter, int n, List<Teacher>teachers ) {
        prestigeOfPlace=(mainCharacter.father.intelligence+mainCharacter.mother.intelligence)/110+mainCharacter.intelligence/60;
        levelOfEducation=(mainCharacter.father.wisdom+mainCharacter.mother.wisdom)/300+mainCharacter.wisdom/130;
        wealthOfPlace=(mainCharacter.father.earnings+mainCharacter.mother.earnings)/4000;
        for(int v = 0; v < n ;v++){
            teachers.add(new Teacher());
        }
    }
}
