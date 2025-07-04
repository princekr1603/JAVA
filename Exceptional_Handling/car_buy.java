class OutOfStockException extends Exception{
    private String message;
    OutOfStockException(String message){
        this.message=message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
class car{
    int items =5;
    void buy(int product) throws OutOfStockException{
        if(product<items){
            System.out.println("product ia available for sell");
            items-=product;
        }
        else{
            throw new OutOfStockException("not available items");
        }
    }
    
}
public class car_buy {
    public static void main(String[] args) {
        car c=new car();
        System.out.println(c.items);
        try{
            c.buy(3);
        }
        catch(OutOfStockException e){
            System.out.println(e.getMessage());
        }

    }
}
