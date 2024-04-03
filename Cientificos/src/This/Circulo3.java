package This;

public class Circulo3 {
	int coordenadax;
	int coordenaday;
	int radio;
	
		Circulo3(int x,int y, int r){
			coordenadax=x;
			coordenaday= y;
			radio= r;
		}
	
	
	
Circulo3 elMayor(Circulo3 c) {
	Circulo3 copiaThis= new Circulo3(this.coordenadax,this.coordenaday,this.radio);
	Circulo3 copiaC= new Circulo3(c.coordenadax,c.coordenaday,c.radio);
	return this.radio>c.radio? copiaThis:copiaC;
}
}
