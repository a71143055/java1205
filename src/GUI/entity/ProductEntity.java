package GUI.entity;

public class ProductEntity {
    private String productNum;
    private String productName;
    private String getProductName;
    private int stockNum;
    private int unitPrice;
    private String manufacturer;

    public String getProductNum() {
        return productNum;
    }

    public String getProductName() {
        return productName;
    }

    public String getGetProductName() {
        return getProductName;
    }

    public int getStockNum() {
        return stockNum;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setGetProductName(String getProductName) {
        this.getProductName = getProductName;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
