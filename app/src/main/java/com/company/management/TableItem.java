package com.company.management;

public class TableItem {
    public String material;
    public String size;
    public String number;
    public String unit;
    public TableItem(){
        material = "点击选择";
        size = "点击选择";
        number = "点击输入";
        unit = "unit";
    }
    public void setMaterial(String m) {
        material = m;
    }
    public void setSize(String s) {
        size = s;
    }
    public void setNumber(String n) {
        number = n;
    }
    public void setUnit(String u) {
        unit = u;
    }
    public String getMaterial() {
        return material;
    }
    public String getSize() {
        return size;
    }
    public String getNumber() {
        return number;
    }
    public String getUnit() {
        return unit;
    }
}
