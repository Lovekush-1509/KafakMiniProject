package learn.kafka.dto;

public record OrderDTO(
        int userId,
        int amount,
        int orderId,
        int productId,
        String productName
){

    public Object getUserId(){
        return userId;
    }

    public Object getAmount(){
        return amount;
    }
    public Object getOrderId(){
        return orderId;
    }
    public Object getProductId(){
        return productId;
    }
    public Object getProductName(){
        return productName;
    }

}