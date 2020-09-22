package sk.upjs.ics.kopr;

import sk.upjs.ics.kopr.soap.server.CoronaServiceService;

public class Client {
        public static void main(String[] args) {
                CoronaServiceService service = new CoronaServiceService();
                var port = service.getCoronaServicePort();
                var cases = port.getListOfInfected(null);
                cases.forEach(System.out::println);
        }
}