package adelium.cours.java;

public class Personne {
	
	private String Nom;
	private String Prenom ;
	private float Poids ;
	private float Taille ;
	private Genre sexe ;
	
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public float getPoids() {
		return Poids;
	}
	public void setPoids(float poids) {
		Poids = poids;
	}
	public float getTaille() {
		return Taille;
	}
	public void setTaille(float taille) {
		Taille = taille;
	}
	public Genre getSexe() {
		return sexe;
	}
	public void setSexe(Genre sexe) {
		this.sexe = sexe;
	}

	public Personne(String nom, String prenom, float poids, float taille, Genre sexe) {
		super();
		Nom = nom;
		Prenom = prenom;
		Poids = poids;
		Taille = taille;
		this.sexe = sexe;
	}
	
	public float IMC()
	{
		return this.Poids / (this.Taille * this.Taille) ;
	}

	
	public float PoidsMin()
	{
		return (19 * this.Taille * this.Taille) ;
	}
	
	public float PoidsMax()
	{
		return (25 * this.Taille * this.Taille) ;
	}
	
	public float PoidsIdeal()
	{
		if (this.sexe == Genre.MASCULIN)
			return (22 * this.Taille * this.Taille) ;
		else // Ce else est maintenu pour la clarté du code
			return (21 * this.Taille * this.Taille) ;
	    
	
	}
	
	public String Diagnostic()
	{
		float imc = this.IMC();
		
		if (imc < 17)
			return "Anorexique" ;
		if (imc < 19)
			return "Maîgre" ;
		if (imc < 25)
			return "Super forme" ;
		if (imc < 30)
			return "Kilos +" ;
		if (imc < 40)
			return "Obèse léger" ;
		
		return "Obèse morbide" ;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nom = ");
		builder.append(Nom);
		builder.append("\nPrenom =");
		builder.append(Prenom);
		builder.append("\nPoids = ");
		builder.append(Poids);
		builder.append("\nTaille = ");
		builder.append(Taille);
		builder.append("\nsexe = ");
		builder.append(sexe);
		builder.append("\nIMC = ");
		builder.append(IMC());
		builder.append("\nPoidsMin = ");
		builder.append(PoidsMin());
		builder.append("\nPoidsMax = ");
		builder.append(PoidsMax());
		builder.append("\nPoidsIdeal = ");
		builder.append(PoidsIdeal());
		builder.append("\nDiagnostic = ");
		builder.append(Diagnostic());
		
		return builder.toString();
	}
	
	
	
}
