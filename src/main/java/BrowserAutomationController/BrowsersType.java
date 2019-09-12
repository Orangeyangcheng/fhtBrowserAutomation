package BrowserAutomationController;

public class BrowsersType {
    /**
     * 浏览器类型
     */
    private String browsersType;
    /**
     * 浏览器驱动地址
     */
    private String webDriverAddress;
    /**
     * 浏览器地址启动地址
     */
    private String url;


    public String getBrowsersType() {
        return browsersType;
    }

    public void setBrowsersType(String browsersType) {
        this.browsersType = browsersType;
    }


    public String getWebDriverAddress() {
        return webDriverAddress;
    }

    public void setWebDriverAddress(String webDriverAddress) {
        this.webDriverAddress = webDriverAddress;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
