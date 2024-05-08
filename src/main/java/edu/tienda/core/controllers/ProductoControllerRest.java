package edu.tienda.core.controllers;

import edu.tienda.core.domain.Producto;
import edu.tienda.core.services.ProductoService;
import edu.tienda.core.services.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoControllerRest {
    /*Se instancia con java Puro
    private ProductoService productoService= new ProductoServiceImpl();
    */

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<?> getProductos(){
        List<Producto>productos=productoService.getProductos();
        return ResponseEntity.ok(productos);
    }
}
