package enumerado;

public enum week implements ej2{
Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;


@Override
public int dia() {
	return ordinal() +1;
}
}
