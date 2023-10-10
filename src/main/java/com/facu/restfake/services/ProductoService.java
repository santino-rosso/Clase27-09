package com.facu.restfake.services;


import com.facu.restfake.entities.Product;

import java.util.List;


public interface ProductoService extends BaseService<Product,Long> {

    List<Product> buscarPorPrecioMayorA(Double precioMinimo) throws Exception;
    List<Product> buscarPorPrecioMayorA_sql(Double precioMinimo) throws Exception;
    List<Product> buscarPorPrecioEntre(Double precioMinimo, Double precioMaximo) throws Exception;
    List<Product> buscarPorPrecioEntre_sql(Double precioMinimo, Double precioMaximo) throws Exception;




}


