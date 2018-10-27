package cn.absalom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("s")
public class ProductService {
    public void dosomeService(){
        System.out.println("dosomeService");
    }
}
