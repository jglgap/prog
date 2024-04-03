package tecla2;
import java.time.ZonedDateTime;
public class ZonaDateTime {

	public static void main(String[] args) {
		ZonedDateTime date= ZonedDateTime.now();
		
		System.out.printf("Hoy es %1$tA, %1$td de %1$tB de %1$tY %n", date);
		System.out.printf("Son las %1$tH:%1$tM:%1$tS [%1$tp] %n", date);
		System.out.printf("En la zona horaria %s [%tz] %n", date.getZone(),date);

	
	}

	
	}


