package by.bsuir.task3;

import java.math.BigDecimal;

public class Warehouse {
    private long numProducts;
    private BigDecimal priceOnePiece;

    public Warehouse() {
    }

    public Warehouse(long numProducts, BigDecimal priceOnePiece) {
        this.numProducts = numProducts;
        this.priceOnePiece = priceOnePiece;
    }

    public void setNumProducts(long numProducts) {
        this.numProducts = numProducts;
    }

    public void setPriceOnePiece(BigDecimal priceOnePiece) {
        this.priceOnePiece = priceOnePiece;
    }

    public BigDecimal getSum() {
        return priceOnePiece.multiply(BigDecimal.valueOf(numProducts));
    }

    public int comparePrice(Warehouse warehouse) {
        return this.priceOnePiece.subtract(warehouse.priceOnePiece).intValue();
    }

    public long getGeneralNumProducts(Warehouse ... warehouses){
        long num = numProducts;
        for(Warehouse warehouse : warehouses){
            num+= warehouse.numProducts;
        }
        return num;
    }
}
