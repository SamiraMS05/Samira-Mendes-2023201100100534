import java.util.Scanner;

public class prova {
    public static void main(String[] args) {
        double nota1, nota2, media, exameFinal, mediaFinal; 
        Scanner ler = new Scanner(System.in);

        for (int i = 1; i < 4; i++) {
            System.out.println("Digite a nota da Prova A1 do aluno " +i+": ");
            nota1 = ler.nextDouble();
            System.out.println("Digite a nota da Prova A2 do aluno " +i+": ");
            nota2 = ler.nextDouble();
            media = (nota1 + nota2) / 2;
            System.out.println("Nota final: "+media);

            if (media < 4) {
                System.out.println("Aluno reprovado!");
            } else if (media >= 4 && media < 6) {
                System.out.println("Aluno de exame final. Digite a nota do exame final: ");
                exameFinal = ler.nextDouble();
                mediaFinal = (media + exameFinal) / 2;
                System.out.println("Média final do aluno: "+mediaFinal);
                if (mediaFinal >= 6) {
                    System.out.println("Aluno "+i+ " está aprovado!");
                } else {
                    System.out.println("Aluno "+i+" está reprovado!");
                }
            } else {
                System.out.println(" Aluno "+i+" está aprovado!");
            }

        }
    }
}