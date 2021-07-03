import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[]ags){
        Locale.setDefault(Locale.US);
        Scanner num = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao Divulgar Tudo!\n");
        System.out.println("Digite um valor que deseja investir:\n");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(Locale.US);
        double valor = num.nextDouble();
        String Valor = dinheiro.format(valor);
        System.out.println("Valor investido  foi de "+Valor);
        double VizualizaçãoIncial = valor * 30;
        double VisualizacaoBase = VizualizaçãoIncial ;


        double NovasVizualizacaoTotal  = 0;

        for(int compartilhamento = 0;compartilhamento < 4 ; compartilhamento++){
            double NumCliques = VisualizacaoBase * 0.12;
            double NumDeCompartilhamento = NumCliques * 0.15;
            double NovasVisualizacao = NumDeCompartilhamento * 40;
            VisualizacaoBase = NovasVisualizacao;
            NovasVizualizacaoTotal += VisualizacaoBase ;
        }

        double total =  NovasVizualizacaoTotal + VizualizaçãoIncial;
        System.out.printf("O resultado aproximado é de %.0f de Visulizações",total);

    }
}
