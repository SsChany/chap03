package class26.exam02;

public class ProductMain {

	public static void main(String[] args) {
		Product pro1 = new Product();
		pro1.id=202103001;
		pro1.name="냉장고";
		pro1.price=500;
		pro1.quantity=5;
		pro1.showProductInfo();
		System.out.println();
		
		Product pro2 = new Product(202103001,"세탁기",250,-15,-3750);
		pro2.showProductInfo();
	}

}
