package learn.kafka.dto;

public record PaymentDTO(
        OrderDTO orderdto,
        int amountPaid
) {
    public Object getAmountPaid(){
        return amountPaid;
    }

    public Object getOrderDto(){
        return orderdto;
    }
}
