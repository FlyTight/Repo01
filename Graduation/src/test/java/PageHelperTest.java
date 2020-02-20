import com.bishe.paper.Service.Impl.PaperImpl;
import com.bishe.paper.Service.paperService;
import com.bishe.paper.bean.paper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class PageHelperTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
        paperService bean = context.getBean(paperService.class);
        PageHelper.startPage(1,5); //必须在获取集合之前设置，第一个参数是第几页，第二个是每页显示几条
        List<paper> list = bean.getLists(2);
        //获取页数数据
        PageInfo<paper> pageInfo = new PageInfo<paper>(list,5);
        System.out.println("getPageNum当前页是："+pageInfo.getPageNum());
        System.out.println("getPages总页数："+pageInfo.getPages());
        System.out.println("getTotal总记录数："+pageInfo.getTotal());
        System.out.println("getPageSize每页显示:"+pageInfo.getPageSize());
        System.out.println("isIsFirstPage当前页是否为第一页："+pageInfo.isIsFirstPage());
        System.out.println("isIsLastPage当前页是否为末页："+pageInfo.isIsLastPage());
        System.out.println("isHasPreviousPage当前页是否有上一页"+pageInfo.isHasPreviousPage());
        System.out.println("isHasNextPage当前页是否有下一页"+pageInfo.isHasNextPage());
        System.out.println("下面的导航页数"+pageInfo.getNavigatepageNums());//获取数组
        System.out.println(pageInfo.getList());
        for (paper customer : pageInfo.getList()) {
            System.out.println(customer);
        }
    }
}
