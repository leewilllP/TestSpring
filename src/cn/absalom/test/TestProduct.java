package cn.absalom.test;

import cn.absalom.pojo.Product;
import cn.absalom.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProduct {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );
        ProductService productService = (ProductService) context.getBean("s");
        productService.dosomeService();
        Product product = (Product) context.getBean("p");
        System.out.println(product.getName());
        System.out.println(product.getCategory().getName());
    }
}
