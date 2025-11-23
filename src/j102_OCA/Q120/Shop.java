package j102_OCA.Q120;

class Cart {
	Product p=new Product();

	double totalAmount;

	@Override
	public String toString() {
		return "Cart{" +
				"p=" + p +
				", totalAmount=" + totalAmount +
				'}';
	}
}
class Product {

	String name;
	double price;

	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}

 public class Shop {
	public static void main(String[] args) {
		Cart c = new Cart();

		c.p.name="Ali";
		c.p.price=12.0;

		System.out.println(c.p + ":" + c.totalAmount );
	
	}

}
/*What is the result?
A. null:null:0.0
B. null:null
C. <<HashCode>>:0.0
D. null:0.0
Answer: D
*/