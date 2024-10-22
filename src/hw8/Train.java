package hw8;

import java.util.Objects;

class Train implements Comparable<Train> {
    private int number;     // 班次
    private String type;    // 車種
    private String start;   // 出發地
    private String dest;    // 目的地
    private double price;   // 票價

    // Train 的建構子
    public Train(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    // Getter 和 Setter 方法
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 讓物件印出的時候顯示詳細資料
    @Override
    public String toString() {
        return " [班次=" + number + ", 車種=" + type + ", 出發地=" + start + ", 目的地=" + dest + ", 票價=" + price + "]";
    }

    // 實現 Comparable 介面以便根據班次編號排序
    @Override
    public int compareTo(Train other) {
        return Integer.compare(other.number, this.number); // 班次從大到小排序
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return number == train.number &&
                Double.compare(train.price, price) == 0 &&
                Objects.equals(type, train.type) &&
                Objects.equals(start, train.start) &&
                Objects.equals(dest, train.dest);
    }
    @Override
    public int hashCode() {
        return Objects.hash(number, type, start, dest, price);
    }

    // 顯示詳細資料的方法
    public void display() {
        System.out.println(this.toString());
    }
}
