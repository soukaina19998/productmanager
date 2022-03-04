package get.arrays.productmanager.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import get.arrays.productmanager.model.product;
import java.util.*;
@RestController
public class productcontroller {
   private  productservice prdservice;
   @GetMapping
    public ResponseEntity<List<product>> getAllproduits(){
       List<product> products=prdservice.getAllProducts();
       return new ResponseEntity<>(products, HttpStatus.OK);
   }
   public ResponseEntity<List<product>> getproduitById(Long id){
      List<product> products=prdservice.getAllProducts();
      return new ResponseEntity<>(products, HttpStatus.OK);
   }


}
