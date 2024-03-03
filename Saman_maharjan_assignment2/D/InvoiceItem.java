package D;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;


    public InvoiceItem(String id,String desc, int qty, double unitPrice){
        this.qty=qty;
        this.desc=desc;
        this.id=id;
        this.unitPrice=unitPrice;
    }
    public String getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }
    public int getQty() {
        return qty;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return this.qty * this.unitPrice;
    }

    @Override
    public String toString() {
      return "InvoiceItem[" +
          "id=" + id +
          "desc=" + desc +
          "qty=" + qty +
          ", unitPrice=" + unitPrice + '\'' +
          ']';
    }
}
