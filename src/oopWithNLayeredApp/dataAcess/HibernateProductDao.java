package oopWithNLayeredApp.dataAcess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{

    public  void add(Product product){
        //Sadece database erişim kodları buraya yazılır.SQL bilmek gerekli
        System.out.println("Hibernate ile veritabanına eklendi");



}
}
