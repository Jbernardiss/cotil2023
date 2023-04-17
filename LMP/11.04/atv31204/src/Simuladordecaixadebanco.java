public class Simuladordecaixadebanco {




    public class SimuladorCaixaBanco {
        private static int numeroDoCliente;
        private int numeroDoCaixa;
        SimuladorCaixaBanco(int n)
        {
            numeroDoCaixa = n;
            numeroDoCliente = 0;
            System.out.println("Caixa "+numeroDoCaixa+" iniciou operação.");
        }
        public void proximoAtendimento()
        {
            numeroDoCliente = numeroDoCliente + 1;
            System.out.print("Cliente com a senha no "+numeroDoCliente+" , favor ");
            System.out.println("dirigir-s ao caixa no "+numeroDoCaixa+".");
        }
    }
}
