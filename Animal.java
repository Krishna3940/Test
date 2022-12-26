class creature extends supreme{
	public void speak() {
		System.out.println("i am creature,created by supreme");
	}
}
class supreme
{
	public void speak() {
		System.out.println("i am an supreme");
	}
}
public class Animal{
  public static void main(String[] args) {
		supreme obj=new creature();
		obj.speak();
		obj=new non_living();
		obj.speak();

	}

}
