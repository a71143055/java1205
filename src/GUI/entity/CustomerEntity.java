package GUI.entity;

public class CustomerEntity {
    private String customerId;
    private String customerName;
    private int age;
    private String level;
    private String job;
    private int savedMoney;

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAge() {
        return age;
    }

    public String getLevel() {
        return level;
    }

    public String getJob() {
        return job;
    }

    public int getSavedMoney() {
        return savedMoney;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSavedMoney(int savedMoney) {
        this.savedMoney = savedMoney;
    }
}
