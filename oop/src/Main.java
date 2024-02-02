public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        //set value
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");
        //get
//        System.out.println(product1.name);

        Product product2 = new Product();
        //set value
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");
        //get
//        System.out.println(product2.name);

        Product product3 = new Product();
        //set value
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");

        //get
//        System.out.println(product3.name);

        Product[] products={product1,product2,product3};
        
        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05666666666");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Enes");
        individualCustomer.setLastName("Horos");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("05111111111");
        corporateCustomer.setTaxNumber("11111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers ={individualCustomer,corporateCustomer};
    }
}