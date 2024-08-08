public class Mobile {
    private int productId;
    private String brandName;
    private String modelName;
    private String memory;
    private int price;
    private String colour;

    public Mobile(int productId, String brandName, String modelName, String memory, int price, String colour) {
        this.productId = productId;
        this.brandName = brandName;
        this.modelName = modelName;
        this.memory = memory;
        this.price = price;
        this.colour = colour;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
