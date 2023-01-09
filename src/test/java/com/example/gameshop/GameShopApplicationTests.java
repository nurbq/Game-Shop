package com.example.gameshop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class GameShopApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    DataSource dataSource;

    @Test
    public void testConnection() throws SQLException{

        System.out.println("DataSource: " + dataSource);
        Connection conn = dataSource.getConnection();
        System.out.println("Connection: " + conn);

        conn.close();
    }

}
