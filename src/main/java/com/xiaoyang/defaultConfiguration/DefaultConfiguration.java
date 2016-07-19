package com.xiaoyang.defaultConfiguration;

/**
 * 
 * @author zyhe
 *
 */
public class DefaultConfiguration {

    private String pageLogin = "/login.html";
    private String page404 = "/404.html";
    private String page505 = "/505/html";
    private String defaultViewPath = "admin";

    public String getPageLogin() {
        return pageLogin;
    }

    public void setPageLogin(String pageLogin) {
        this.pageLogin = pageLogin;
    }

    public String getPage404() {
        return page404;
    }

    public void setPage404(String page404) {
        this.page404 = page404;
    }

    public String getPage505() {
        return page505;
    }

    public void setPage505(String page505) {
        this.page505 = page505;
    }

    public String getDefaultViewPath() {
        return defaultViewPath;
    }

    public void setDefaultViewPath(String defaultViewPath) {
        this.defaultViewPath = defaultViewPath;
    }

}
