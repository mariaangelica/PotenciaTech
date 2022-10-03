public class Conta {
       double saldo=10.0;  //variavel da classe conta

    public void sacar(Double valor) {
            double novoSaldo = saldo - valor; //variavel local de método
    }
    public void imprimirSaldo(){
        System.out.println(saldo); //disponível em toda classe

        //System.out.println(novoSaldo); //somente o método sacar conhece esta variavel
    }

    public double calcularDividaExponencial(){
        double valorParcela = 50.0;    //variável local de método
        double valorMontante = 0.0;   // começando a variável com valor zero
        for(int x=1; x<=5; x++) {    //x variável de escopo de fluxo
            double valorCalculado = valorParcela * x;  //esta variável será reiniciada a cada execução for
            valorMontante = valorMontante + valorCalculado;
        }
        //escopo de fluxo
        //x e valorCalculado nunca estarão disponíveis fora do for

        return valorMontante;
    }
}
