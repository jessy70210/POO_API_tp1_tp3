import junit.framework.TestCase;

public class SecteurTest extends TestCase {

    public void testCompareTo() throws AnimalDansMauvaisSecteurException {
        Secteur s1 = new Secteur(TypeAnimal.CHIEN);
        int nbChien = 12;
        for (int i = 0; i < nbChien; ++i) s1.ajouterAnimal(new Chien(String.valueOf(i), TypeAnimal.CHIEN));

        Secteur s2 = new Secteur(TypeAnimal.CHAT);
        int nbChat = 9;
        for (int i = 0; i < nbChat; ++i) s2.ajouterAnimal(new Chat(String.valueOf(i), TypeAnimal.CHAT));


        assertEquals(12-9, s1.compareTo(s2));

        int nbChatSupp = 10;
        for(int i = nbChat; i < (nbChat+nbChatSupp); ++i) s2.ajouterAnimal(new Chat(String.valueOf(i), TypeAnimal.CHAT));

        assertEquals(12-(9+10), s1.compareTo(s2));
    }
}