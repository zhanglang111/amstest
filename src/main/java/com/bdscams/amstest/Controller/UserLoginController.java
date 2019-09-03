package com.bdscams.amstest.Controller;

import com.bdscams.amstest.Service.UserService;
import com.bdscams.amstest.Vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.DocFlavor;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserLoginController {

    @Autowired
    UserService userService;

    /**
     * 跳转到用户登录页面
     * @return 登录页面
     */
    @RequestMapping(value = {"/loginHtml"})
    public String loginHtml(HttpServletRequest request){
        request.setAttribute("name","zhanglang");
        return "userLogin";
    }

    @RequestMapping("/test01")
    public String thymeleaf(ModelMap map){
        List<TestVo> testVos=new ArrayList<>();
        testVos.add(new TestVo("数学",10,new Date(),1));
        testVos.add(new TestVo("数学0001",70,new Date(),2));
        testVos.add(new TestVo("数学01",100,new Date(),3));
        map.put("test",testVos);
        return "test";
    }

    @RequestMapping("/logintest")
    public String logintest(ModelMap map){
        return "logintest";
    }

    /**
     * 跳转到用户注册页面
     * @return 注册页面
     */
    @RequestMapping(value = {"/registerpage"})
    public String registerpage(){
        return "register";
    }

    @RequestMapping("/userLogin")
    public String userLogin(HttpServletRequest request, HttpServletResponse response){

        String username = request.getParameter("username");
        String password = request.getParameter("password");


        //网上说的自动填充
        HttpSession session = request.getSession();//此处是获取并存储sessio值，不用管
        session.setAttribute("username", username);
        session.setAttribute("password", password);


        Cookie cookie = new Cookie("username", username);// 创建cookie
        response.addCookie(cookie);//添加到浏览器
        Cookie cookie2 = new Cookie("password", password);
        response.addCookie(cookie2);



        //先使用COOKIE吧
//        Cookie cookie1 = new Cookie("username",username);
//        Cookie cookie2 = new Cookie("password",password);
//        cookie1.setMaxAge(1000);
//        cookie2.setMaxAge(1000);
//        response.addCookie(cookie1);
//        response.addCookie(cookie2);

//        HttpSession session = request.getSession();
//
//        session.setAttribute("username",username);
//        session.setAttribute("password",password);

        //教授
        request.getSession().setAttribute("username",username);
        request.getSession().setAttribute("password", password);
        request.getSession().setMaxInactiveInterval(10*60);//10 min后session失效



        if(userService.userlogin(username,password)!=0){
            return "index";
        }
        return "loginError";
    }

    @PostMapping("/userLoginTest")
    public String userLoginTest(HttpServletRequest request, HttpServletResponse response){
        String[] checkbox = request.getParameterValues("checkbox");
        String name = request.getParameter("account");
        String password = request.getParameter("pwd");
        if (checkbox != null) {// 已勾选功能
            for (String str : checkbox) {
                // 判断是否勾选记住密码功能
                if (str.equals("1")) {
                    // 组合登录信息
                    String loginInfo = name + "+" + password;
                    // 将登陆信息编码
                    try {
                        loginInfo = URLEncoder.encode(loginInfo, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    // 创建Cookie
                    Cookie userCookie = new Cookie("loginInfo", loginInfo);
                    // 设置Cookie存活期限
                    userCookie.setMaxAge(30*24*60*60);//设置存活期一个月
                    // 设置所有路径下共享Cookie
                    userCookie.setPath("/");
                    // 添加Cookie到服务器响应中
                    response.addCookie(userCookie);
                }
                // 判断是否勾选自动登录功能
                if (str.equals("2")) {
//                    request.getSession().setAttribute("agent",agent);
                }
            }
        } else {// 未勾选功能，或取消勾选功能，删除Cookie信息
            String loginInfo = name + "+" + password;
            try {
                loginInfo = URLEncoder.encode(loginInfo, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            Cookie userCookie = new Cookie("loginInfo", loginInfo);
            userCookie.setMaxAge(0);//删除cookie,只需要将失效时间设置为0即可，其他步骤一样
            userCookie.setPath("/");
            response.addCookie(userCookie);
        }
// 在测试中可能会出现一些问题，清除掉Cookie重新添加，在测试。
        return  "index";
    }
}
