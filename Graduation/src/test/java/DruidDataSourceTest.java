import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class DruidDataSourceTest {

    @Test
    public void test01() throws SQLException {
        ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource bean = Context.getBean(DruidDataSource.class);
        DruidPooledConnection connection = bean.getConnection();
        System.out.println(connection);
    }
}
