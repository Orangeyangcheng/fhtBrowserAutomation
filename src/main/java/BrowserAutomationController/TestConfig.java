package BrowserAutomationController;

public class TestConfig {
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
    /**
     * 屏幕尺寸大小
     * 0-默认 1-全屏 2-最大化 3-自定义大小
     */
    private int screenSize;
    /**
     * 屏幕宽度
     */
    private int screenWidth;
    /**
     * 屏幕高度
     */
    private int screenHeight;

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

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
