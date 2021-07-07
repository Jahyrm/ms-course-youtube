package ucuenca.web.store.shopping.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import ucuenca.web.store.shopping.model.Product;

@Component
public class ProductHystrixFallbackFactory implements ProductClient {

    @Override
    public ResponseEntity<Product> getProduct(Long id) {
        Product product = Product.builder().name("none").build();
        return ResponseEntity.ok(product);
    }

    @Override
    public ResponseEntity<Product> updateStockProduct(Long id, Double quantity) {
        Product product = Product.builder().name("none").build();
        return ResponseEntity.ok(product);
    }

}
