package get.arrays.productmanager.repo;

import get.arrays.productmanager.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<product,Long> {
    void deleteEmployeeByid(Long id);
   Optional<product> findEmployeeByid(Long id);

}
