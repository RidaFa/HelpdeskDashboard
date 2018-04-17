package com.HelpdeskDashboard.Entitie;


public class Product {
    private int ProductID;
    private String ProductName;
    private String ProductDesc;
    private int StartingInventory;
    private int InventoryReceived;
    private int InventoryUsed;
    private int InventoryOnHand;
    private int MinimumRequired;
    private String DateLastUpdate;

    public Product(int productID, String productName, String productDesc, int startingInventory, int inventoryReceived, int inventoryUsed, int inventoryOnHand, int minimumRequired, String dateLastUpdate) {
        this.ProductID = productID;
        this.ProductName = productName;
        this.ProductDesc = productDesc;
        this.StartingInventory = startingInventory;
        this.InventoryReceived = inventoryReceived;
        this.InventoryUsed = inventoryUsed;
        this.InventoryOnHand = inventoryOnHand;
        this.MinimumRequired = minimumRequired;
        this.DateLastUpdate = dateLastUpdate;
    }
    public Product(){

    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        this.ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        this.ProductName = productName;
    }

    public String getProductDesc() {
        return ProductDesc;
    }

    public void setProductDesc(String productDesc) {
        this.ProductDesc = productDesc;
    }

    public int getStartingInventory() {
        return StartingInventory;
    }

    public void setStartingInventory(int startingInventory) {
        this.StartingInventory = startingInventory;
    }

    public int getInventoryReceived() {
        return InventoryReceived;
    }

    public void setInventoryReceived(int inventoryReceived) {
        this.InventoryReceived = inventoryReceived;
    }

    public int getInventoryUsed() {
        return InventoryUsed;
    }

    public void setInventoryUsed(int inventoryUsed) {
        this.InventoryUsed = inventoryUsed;
    }

    public int getInventoryOnHand() {
        return InventoryOnHand;
    }

    public void setInventoryOnHand(int inventoryOnHand) {
        this.InventoryOnHand = inventoryOnHand;
    }

    public int getMinimumRequired() {
        return MinimumRequired;
    }

    public void setMinimumRequired(int minimumRequired) {
        this.MinimumRequired = minimumRequired;
    }

    public String getDateLastUpdate() {
        return DateLastUpdate;
    }

    public void setDateLastUpdate(String dateLastUpdate) {
        this.DateLastUpdate = dateLastUpdate;
    }
}
