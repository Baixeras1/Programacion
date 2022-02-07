package parametros;

public class Main {

	public static void main(String[] args) {
		int a = 12;
		Empleado []em=new Empleado[3];
		for (int i=0;i<em.length;i++) {
		String dni=String.valueOf(i);
		em[i]=new Empleado(dni,"ana"+dni,i+18);
		}
		int []valores = {9,3,5};
		queHace(a,em,valores);
		System.out.println(em[1].getDNI());
		System.out.println(valores[2]);
		a += 3;
		System.out.println(""+queHace2(em,a,valores));
		}
		public static void queHace(int e,Empleado[] s,int []t) {
		e = e + 2;
		for (int i =0;i<t.length;i++) {
		t[i]=t[i] + e + i;
		}
		for (int i =0;i<s.length;i++) {
		Empleado em = s[i];
		em.setDNI(em.getDNI()+t[i]);
		}
		System.out.println(s[2].getDNI());
		}

		public static int queHace2(Empleado a[],int b,int[]c) {
		int suma=0;
		b += 4;
		for (int i =0;i<a.length;i++) {
		int val = Integer.parseInt((a[i].getDNI()));
		suma = suma + c[i] + val;
		}
		return suma;  
		}
}
