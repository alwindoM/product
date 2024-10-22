package product;
public class Product 
{   
    private int    mProductID;
    private String mProductName;
    private double mPrice;
    private int    mQuantity;
    
    public  Product (int productID, String productName, double price, int qty )
    {
            setProduct (productID, productName,price,qty);
    }
    public void setProduct (int productID, String productName, double price, int qty)
    {
            mProductID   = productID;
            mProductName = productName;
            mPrice       = price;
            mQuantity    = qty;
    }
    
    public int  getProductUD()
    {
        return mProductID;
    }
    
    public String getProductName()
    {
        return mProductName;
    }
    
    public double getHarga()
    {
        return mPrice;
    }
    
    public void print()
    {
        System.out.println("Harga : "+mPrice);
    }
    
    public static void main(String[] args) 
    {
        Product tBarang = new Product (0,"Aqua Botol",5000,2);
        tBarang.print();
    }
    
}
