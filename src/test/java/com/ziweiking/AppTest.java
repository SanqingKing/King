package com.ziweiking;

import static org.junit.Assert.assertTrue;

import com.ziweiking.POJO.SetDataSource;
import com.ziweiking.utils.KingObjects;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        String s = new String();
        Class<? extends String> aClass = s.getClass();
        int[] ints = {};
//        int[] ints1 = (aClass.getName()) ints;
        System.out.println(aClass);
    }

    /**
     * 测试getDataSource方法
     * */
    @Test
    public void testGetDataSource() throws SQLException {
        SetDataSource source = new SetDataSource();
        source.setUrlTable("mydb");
        source.setUsername("root");
        source.setPassword("root");
        DataSource dataSource = KingObjects.getDataSource(source);
        String sql="select * from sp";
        Statement statement = dataSource.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        System.out.println(resultSet);
    }
}
