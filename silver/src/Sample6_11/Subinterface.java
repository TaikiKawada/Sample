package Sample6_11;

public interface Subinterface extends Myinterface {
	int getsum();
}
class c implements Subinterface{
	public void getComment() {
		System.out.println("スーパーインターフェースを実装する");
	}
	public int get sum() {
		return(a+5);
	}
}
