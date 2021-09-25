package Pack;





/*
class Tiger{
	void m1() {System.out.println(1);}
	void m2() {System.out.println(2);}
	void m3() {System.out.println(3);}
	void m4() {System.out.println(4);}
	void m5() {System.out.println(5);}
}
interface Delegate {
	void delegate(Tiger t);
}
class Proxy {
	void command(Delegate d) {
		Tiger t = new Tiger();
		t.m1();
		d.delegate(t);
		t.m5();
	}
}
public class World {

	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.command(new Delegate() {
			public void delegate(Tiger t) {
				t.m2();
			}
		});
		System.out.println("--------------------------");
		proxy.command(new Delegate() {
			public void delegate(Tiger t) {
				t.m3();
			}
		});
		System.out.println("--------------------------");
		proxy.command(new Delegate() {
			public void delegate(Tiger t) {
				t.m4();
			}
		});
	}
}
*/