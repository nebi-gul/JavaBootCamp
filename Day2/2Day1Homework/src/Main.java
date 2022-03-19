public class Main {

    public static void main(String[] args) {
        Category category1 = new Category(1, "Programlama");

        Instructer instructer = new Instructer(1, "Engin Demiroğ");

        Product product1 = new Product(1,"Yazılım Geliştirici Kampı (Java +REACT)","Engin Demiroğ",
                "2 Ay Sürecek Yazılım Geliştirici Yetiştirme Kampınızın takip,döküman ve duyuruları.",0);



        Product product2=new Product(2,"Yazılım Geliştirici Kampı (Java Script)","Engin Demiroğ",
                "1,5 Ay Sürecek Yazılım Geliştirici Yetiştirme Kampınızın takip,döküman ve duyuruları.",0);
        Product[] products = {product1,product2};


        for (Product product : products) {
            System.out.println(product.name);
            System.out.println(product.detail);
            System.out.println(product.instructor);
            if (product.unitPrice == 0) {
                System.out.println("Ücretsiz");

            }
        }
        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);

        ProductManager productManager2 = new ProductManager();
        productManager.addToCart(product2);

    }
}
