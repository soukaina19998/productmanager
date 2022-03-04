package get.arrays.productmanager.service;
import get.arrays.productmanager.Exception.userNotFound;
import get.arrays.productmanager.model.product;
import get.arrays.productmanager.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productservice {
    @Autowired
    private ProductRepository productrepo;

    public product AddProduct(product p) {
        return productrepo.save(p);
    }

    public product UpdateProduct(product p) {
        return productrepo.save(p);
    }

    public List<product> getAllProducts() {
        return productrepo.findAll();
    }
    public void DeleteProduct(Long id) {
        productrepo.deleteEmployeeByid(id);
    }
    public product findProduct(Long id) throws Throwable {
       return (product) productrepo.findEmployeeByid(id).orElseThrow(()-> new userNotFound("user not found"));
    }

}


