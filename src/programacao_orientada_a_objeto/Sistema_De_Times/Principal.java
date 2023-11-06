package programacao_orientada_a_objeto.Sistema_De_Times;

import programacao_orientada_a_objeto.Sistema_De_Times.Class.TimesDeSports;

public class Principal {
    public static void main(String[] args) {

        int NT = 0;

        TimesDeSports Ts1 = new TimesDeSports(++NT);  
        
        TimesDeSports Ts2 = new TimesDeSports(++NT);

        TimesDeSports Ts3 = new TimesDeSports(++NT);

        TimesDeSports Ts4 = new TimesDeSports(++NT);
        
        Ts1.Info();
        Ts2.Info();
        Ts3.Info();
        Ts4.Info();
    }
}
