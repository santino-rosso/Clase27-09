package com.facu.restfake.controllers;

import com.facu.restfake.entities.Product;
import com.facu.restfake.services.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "fakestoreapi.com/products")
public class ProductController extends BaseControllerImpl<Product, ProductServiceImpl>{

    @GetMapping("/mayor")
    public ResponseEntity<?> buscarPorPrecioMayorA(@RequestParam Double precioMinimo){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorPrecioMayorA(precioMinimo));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }

    @GetMapping("/mayor_sql")
    public ResponseEntity<?> buscarPorPrecioMayorA_sql(@RequestParam Double precioMinimo){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorPrecioMayorA_sql(precioMinimo));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }

    @GetMapping("/entre")
    public ResponseEntity<?> buscarPorPrecioEntre(@RequestParam Double precioMinimo, @RequestParam Double precioMaximo){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorPrecioEntre(precioMinimo, precioMaximo));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }

    @GetMapping("/entre_sql")
    public ResponseEntity<?> buscarPorPrecioEntre_sql(@RequestParam Double precioMinimo, @RequestParam Double precioMaximo){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.buscarPorPrecioEntre_sql(precioMinimo, precioMaximo));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde.\"}");
        }
    }
}
