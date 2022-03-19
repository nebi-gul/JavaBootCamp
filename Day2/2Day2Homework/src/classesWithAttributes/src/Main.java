public class Main {


    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","Asus",4000,"Siyah",4);



        ProductManager productManager = new ProductManager();
        productManager.add(product);

        System.out.println(product.getKod());
    }

}
