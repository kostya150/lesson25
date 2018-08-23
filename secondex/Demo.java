package lesson25.secondex;

import lesson25.Order;

public class Demo {
    public static void main(String[] args) throws Exception {

        Order order = new Order(111);
        Sys sys = new Sys(11,"///");
        GeneralDAO generalDAO = new GeneralDAO<>();
        generalDAO.save("Name");
        generalDAO.save(order);
        generalDAO.save(sys);

    }








}
