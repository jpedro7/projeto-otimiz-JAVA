package src.br.com.cesarschool.projeto.entities;

import java.util.Scanner;

public class Consultoria {
        private static final Scanner INPUT = new Scanner(System.in);

        private int pontuacao;
        private boolean avaliado;

        public int getPontuacao() {
                return pontuacao;
        }

        public boolean isAvaliado() {
                return avaliado;
        }

        public void setPontuacao(int pontuacao) {
                this.pontuacao = pontuacao;
        }

        public void setAvaliado(boolean avaliado) {
                this.avaliado = avaliado;
        }

        public void realizarConsultoria() {
                int reposta1;
                int reposta2;
                int reposta3;

                System.out.println(
                                "\nO modelo de negócio busca em seus produtos ou serviços solucionar algum problema socioambiental?");
                System.out.println("0 - Nenhum");
                System.out.println("1 - Um");
                System.out.println("2 - Dois");
                System.out.println("3 - Três");
                System.out.println("4 - Mais de três");
                System.out.print("Sua resposta: ");

                reposta1 = INPUT.nextInt();
                System.out.println();

                System.out.println(
                                "No dia a dia em que grau as questões socioambientais as são levadas em consideração antes tomada de decisão?");
                System.out.println("0 - Zero");
                System.out.println("1 - Um");
                System.out.println("2 - Dois");
                System.out.println("3 - Três");
                System.out.println("4 - Quatro");
                System.out.println("5 - Cinco");
                System.out.print("Sua resposta: ");

                reposta2 = INPUT.nextInt();
                System.out.println();

                System.out.println(
                                "A empresa realizou um diagnóstico e conhece significativamente os impactos socio ambientais mais significativos?");
                System.out.println("0 - Sim, realizamos um diagnóstico detalhado");
                System.out.println("1 - Temos uma ideia mas não conduzimos um estudo estruturado");
                System.out.println("2 - Não realizamos diagnóstico, nem temos ideia");
                System.out.print("Sua resposta: ");

                reposta3 = INPUT.nextInt();

                this.setPontuacao((int) Math.floor(Math.random() * 999) + 1);
                this.setAvaliado(true);

                System.out.println(
                                "Obrigado por responder ate aqui! Seu questionário foi enviado para análise mas sua pontuação porvisória é: "
                                                + this.getPontuacao());
        }
}
