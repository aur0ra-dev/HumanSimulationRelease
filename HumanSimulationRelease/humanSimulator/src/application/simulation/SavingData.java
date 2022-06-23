package application.simulation;


import application.human.fromHuman.MainCharacter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Klasa odpowiadajaca za zapisywanie do pliku statystyk
 */

public class SavingData {

    /**
     * Metoda zapisuje za pośrednictwem  metod obiektu klasy BufferedWritter do pliku tekstowego  pola obietku klasy MainCharacter
     * @throws  RuntimeException jesli blad w trakcie zapisu do pliku
     * @param arg obiekt klasy mainCharaceter
     */
    public void saveTofile(MainCharacter arg){
         {

            BufferedWriter writer;
            try {
                writer = new BufferedWriter(new FileWriter("zapisz.txt", true));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try{
                writer.append(' ');
                writer.append(arg.name);
                writer.append(", ");
                writer.append(arg.surname);
                writer.append(", ");
                writer.append(String.valueOf(arg.age));
                writer.append(", ");
                writer.append(String.valueOf(arg.intelligence));
                writer.append(", ");
                writer.append(String.valueOf(arg.gender));
                writer.append(", ");
                writer.append(String.valueOf(arg.wisdom));
                writer.append(", ");
                writer.append(String.valueOf(arg.charisma));
                writer.append(", ");
                writer.append(String.valueOf(arg.strength));
                writer.append(", ");
                writer.append(String.valueOf(arg.mentalHealth));
                writer.append(", ");
                writer.append(String.valueOf(arg.earnings));
                writer.append(", ");
                writer.append(String.valueOf(arg.education));
                writer.append(", ");
                writer.append(String.valueOf(arg.haveAPartner));
                writer.append(", ");
                writer.append(String.valueOf(arg.listOfFriends));
                writer.append(", ");
                writer.append(String.valueOf(arg.finalExamResults));
                writer.append(", ");
                writer.append(String.valueOf(arg.listOfBullies));
                writer.append(", ");
                writer.append(String.valueOf(arg.partner));
                writer.append(", ");
                writer.append(String.valueOf(arg.listofChildren));
                writer.append(", ");
                writer.append(String.valueOf(arg.mother));
                writer.append(", ");
                writer.append(String.valueOf(arg.father));

                writer.append("\n");
                writer.close();
            }catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

