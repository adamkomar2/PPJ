
public class MainClass {

	public static void main(String[] args) 
	{
	ZbiorMetod zbior = new ZbiorMetod();
	Liczba liczba = new Liczba();
	Osoba Kowalski = new Osoba ("Adam " , "Komar " , "1993");
	int x = 2;
	float y = 3;
	char z = 4;
	byte v = 5;
	long a = 6534534435353454353L;
	liczba.przypiszWartosc(1);
	zbior.ustalWartosc(x);
	zbior.ustalWartosc(y);
	zbior.ustalWartosc(z);
	zbior.ustalWartosc(v);
	zbior.ustalWartosc(a);
	zbior.ustalWartosc(liczba);
	Kowalski.show();
	

	

	
	}

}
