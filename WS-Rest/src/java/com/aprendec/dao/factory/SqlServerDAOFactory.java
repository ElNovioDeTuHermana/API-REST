package com.aprendec.dao.factory;

import com.aprendec.dao.p.ProductoDAO;
import com.aprendec.dao.factory.SqlServerDAOFactory;
import com.aprendec.dao.p.SQLServerProductoDAO;

public class SqlServerDAOFactory extends DAOFactory  {
    public SqlServerDAOFactory() {
    }
 
    // Estamos aplicando la 2da forma de polimorfismo.
    // Una clase puede ser enmascarada con la interface que implementa
    @Override
    public ProductoDAO getProductoDAO() {
    return new SQLServerProductoDAO();
    }
}
