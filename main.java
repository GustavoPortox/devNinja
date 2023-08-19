import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        /*
         * Criar uma prova que contenha 5 perguntas e de um resultado para o aluno
         * */
        Scanner scan = new Scanner(System.in);
        char[] gabarito = {'a', 'b', 'c', 'a', 'a'};
        final int numeroPerguntas = 5;
        String[] perguntas = {
                "Qual a setima letra do alfabeto?",
                "Qual o resultado de 5x7?",
                "Qual a maior estrela do nosso sistema solar?",
                "Qual o valor de PI?",
                "Complete a frase: Quem com ferro fere__________",
        };
        String[] alternativas = {
                "a)G | b)F | c)J",
                "a)43 | b)35 | c)16",
                "a)Marte | b)Lua | c)Sol",
                "a)3.14 | b)14.3 | c)0.25",
                "a)Com ferro sera ferido | b)Rede globo, a gente se ve por ai! | c)NDA",
        };

        int nota = 0;
        int valorQuestao = 2;
        char resp;
        String aluno;
        char[] respostas = new char[numeroPerguntas];
        System.out.println("Digite seu nome: ");
        aluno = scan.nextLine();
        for (int i = 0; i < numeroPerguntas; i++) {
            System.out.println("---------------");
            System.out.printf("%s%n", perguntas[i]);
            System.out.printf("%s%n", alternativas[i]);
            resp = scan.nextLine().charAt(0);
            respostas[i] = resp;
        }
        System.out.print("Fim da prova, confira o resultado!\n");
        for (int i = 0;i<numeroPerguntas;i++){
            if (gabarito[i] == respostas[i]) {
                nota += valorQuestao;
            }
            else if(respostas[i] != gabarito[i]){
                nota += 0;
            }
        }
        if(nota > 6){
            System.out.printf("Sua nota foi: %d. Parabens, voce foi aprovado!", nota);
        }
        else{
            System.out.printf("Infelizmente sua nota foi %d, voce foi reprovado.\nFoque nos estudos!", nota);
        }
    }
}
