//package org.example.interfaces;
//
//interface CalculatorService {
//    int add(int a, int b);
//}
//
//// Server-side implementation
//class CalculatorServer implements CalculatorService {
//    public int add(int a, int b) { return a + b; }
//}
//
//// Client side
//class CalculatorClient {
//    CalculatorService service;  // Interface reference
//
//    CalculatorClient(CalculatorService s) { service = s; }
//
//    void perform() {
//        System.out.println("Result = " + service.add(10, 20));
//    }
//}
//
//public class I10RMISim {
//    public static void main(String[] args) {
//        CalculatorService server = new CalculatorServer();  // server object
//        CalculatorClient client = new CalculatorClient(server); // client using interface
//        client.perform();
//    }
//}
