package generics;

public class Holder3<T> {
	private T a;
	public Holder3(T a){
		this.a = a;
	}
	public T get(){
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
		Automobile a = h3.get();
		System.out.println("HelloWorld");
	}

}
