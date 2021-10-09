package model;

/**
 * @author Ushan Gallage <ushansanu@gmail.com> (www.linkedin.com/in/ushan-gallage)
 * @since 09/10/2021
 */
public class Item {
    private String itemID;
    private String discription;
    private int packsize;
    private double unitprice;

    public Item() {
    }
    public Item(String itemID, String description, int packsize, double unitprice) {
        this.itemID = itemID;
        this.discription = description;
        this.packsize = packsize;
        this.unitprice = unitprice;
    }
    public String getItemCode() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getPacksize() {
        return packsize;
    }

    public void setPacksize(int packsize) {
        this.packsize = packsize;
    }

    public double getUnitPrice() {
        return unitprice;
    }

    public void setUnitPrice(double unitprice) {
        this.unitprice = unitprice;
    }
}
