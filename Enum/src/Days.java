public enum Days {
    MONDAY("first day",10),TUESDAY("second day",11),
    WEDNESDAY("third day",12),THURSDAY("fourth day",13),
    FRIDAY("sixth day",14),SATURDAY("7th day",15),SUNDAY("8th day",16);

    private final String description;
    private final int order;

    Days(String description,int order){
        this.description=description;
        this.order=order;
    }

    public String getDescription() {
        return description;
    }

    public int getOrder() {
        return order;
    }
}

