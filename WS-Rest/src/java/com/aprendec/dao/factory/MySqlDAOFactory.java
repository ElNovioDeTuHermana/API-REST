package com.aprendec.dao.factory;

import com.aprendec.dao.p.ProductoDAO;
import com.aprendec.dao.p.MySqlProductoDAO;


public class MySqlDAOFactory extends DAOFactory{
         
    public MySqlDAOFactory() {
    }
 
    // Estamos aplicando la 2da forma de polimorfismo.
    // Una clase puede ser enmascarada con la interface que implementa
    @Override
    public ProductoDAO getProductoDAO() {
        return new MySqlProductoDAO();
    }
}
