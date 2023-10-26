package oopWithNLayeredApp.dataAcess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {

    public  void add(Product product){
        //Sadece database erişim kodları buraya yazılır.SQL bilmek gerekli
        System.out.println("JDBC ile veritabanına eklendi");

    }






}
