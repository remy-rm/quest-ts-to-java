public class Photo {

    private String url;
    private String fileName;
    private int width;
    private int height;

    public Photo (String url, String fileName, int width, int height) {
        this.url = url;
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public String getURL() {
        return url;
    }
    public void setURL(String url) {
        this.url = url;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
