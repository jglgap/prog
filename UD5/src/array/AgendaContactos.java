package array;

import java.util.Iterator;

public class AgendaContactos {

	public static void main(String[] args) {
		Contactos[] contacts = new Contactos[20];		
		contacts[0]= new Contactos("Jose","Garcia","jsgarci@gmail.com",24);
		contacts[1]= new Contactos("Manuel","Varela","manuelv@gmail.com",18);
		contacts[2]= new Contactos("Gabriel","Perez","gabarez@gmail.com",45);

		/*System.out.println(contacts[0]);	//recorrer parte especifica del array
		contacts[0].validadorEmail();	*/
		
			for(int i=0;i<contacts.length;i++) {  //recorrer array completo
				System.out.println(contacts[i]);
				contacts[i].validadorEmail();
			}
		
	}
}
