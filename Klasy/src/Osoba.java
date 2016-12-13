
public class Osoba {

public String imie;
public String nazwisko;
public String rokUrodzenia;

public Osoba (String imieP, String nazwiskoP, String rokUrodzeniaP){
this.imie = imieP;
this.nazwisko = nazwiskoP;
this.rokUrodzenia = rokUrodzeniaP;
}
public void show (){
	System.out.println(imie + nazwisko + rokUrodzenia);
}

}
