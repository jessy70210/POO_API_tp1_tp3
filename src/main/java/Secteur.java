import java.util.ArrayList;
import java.util.List;

public class Secteur implements Comparable<Secteur>{

	private List<Animal> animauxDansSecteur = new ArrayList<Animal>();
	private TypeAnimal typeAnimauxDansSecteur;
	
	public Secteur(TypeAnimal typeAnimauxDansSecteur) {
		super();
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
	}

	public void ajouterAnimal(Animal animal) throws AnimalDansMauvaisSecteurException{
		if (animal.getTypeAnimal() != typeAnimauxDansSecteur){
			throw new AnimalDansMauvaisSecteurException();
		}
		animauxDansSecteur.add(animal);
	}
	
	public int getNombreAnimaux(){
		return animauxDansSecteur.size();
	}
	
	public TypeAnimal obtenirType(){
		return typeAnimauxDansSecteur;
	}

	@Override
	public int compareTo(Secteur o) {
		ComparatorSecteur comparatorSecteur = new ComparatorSecteur();
		return comparatorSecteur.compare(this, o);
	}

}
