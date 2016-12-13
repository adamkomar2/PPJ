
public class ZbiorMetod {

public void ustalWartosc (int x)
{
System.out.println("int = " + x );
x++;
System.out.println("int 2= " + x );
}
public void ustalWartosc (float x)
{
System.out.println("float = " + x);
x++;
System.out.println("float 2 = " + x );
}
public void ustalWartosc (Liczba x)
{
x.wyswietlWartosc();
	x.pole ++;
x.wyswietlWartosc();	
}
}
