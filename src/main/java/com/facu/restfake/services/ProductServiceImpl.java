package com.facu.restfake.services;


import com.facu.restfake.entities.Product;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  extends BaseServiceImpl<Product, Long> implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public ProductServiceImpl(BaseRepository<Product, Long> baseRepository, ProductoRepository productoRepositoryRepository) {
        super(baseRepository);
        this.productoRepository = productoRepositoryRepository;
    }

    @Override
    public List<Product> buscarPorPrecioMayorA(Double precioMinimo) throws Exception{
        try{
            List<Product> products = productoRepository.buscarPorPrecioMayorA(precioMinimo);
            return products;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Product> buscarPorPrecioMayorA_sql(Double precioMinimo) throws Exception{
        try{
            List<Product> products = productoRepository.buscarPorPrecioMayorA_sql(precioMinimo);
            return products;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Product> buscarPorPrecioEntre(Double precioMinimo, Double precioMaximo) throws Exception {
        try {
            List<Product> products = productoRepository.buscarPorPrecioEntre(precioMinimo, precioMaximo);
            return products;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Product> buscarPorPrecioEntre_sql(Double precioMinimo, Double precioMaximo) throws Exception {
        try {
            List<Product> products = productoRepository.buscarPorPrecioEntre_sql(precioMinimo, precioMaximo);
            return products;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


}
