public class Product {
    int id;
    String name;
    String instructor;
    String detail;
    double unitPrice;

    public Product(){

        System.out.println("Product");
    }
    public Product (int id,String name,String  instructor,String detail,double unitPrice){
        this.id=id;
        this.name=name;
        this.instructor=instructor;
        this.detail=detail;
        this.unitPrice=unitPrice;
    }
}
