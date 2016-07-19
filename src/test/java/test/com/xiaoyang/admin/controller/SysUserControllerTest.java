package test.com.xiaoyang.admin.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.Rollback;

import com.xiaoyang.admin.exception.UserException;
import com.xiaoyang.admin.model.SysUser;
import com.xiaoyang.admin.service.UserService;

/**
 * 用户信息ControllerTest。
 * 
 * @author zyhe
 * 
 *         DevelopBy : zyhe
 * 
 *         TestDate : 2016/07/19
 *
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})*/
public class SysUserControllerTest {

    @Autowired
    private UserService userService;
    
    @Before
    public void before(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring-mvc.xml","spring-mybatis.xml"});
        userService = (UserService) ac.getBean("UserService");
    }

    
    @Test
    @Rollback(true)
    public void test() throws UserException{
        SysUser sysUser = new SysUser();
        sysUser.setUserName("admin");
        sysUser.setUserType("MM");
        sysUser.setLevelId(0);
        sysUser.setUserSex("M");
        sysUser.setUserAge(18);
        sysUser.setUserPhone(1599993218);
        sysUser.setUserAddress("广州市番禺区天安节能科技园");
        sysUser.setUserCode("admin");
        sysUser.setUserStatus("Y");
        sysUser.setCompanyId(1);
        try {
            userService.insert(sysUser);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

}
