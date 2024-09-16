import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main (String[] args){

   Scanner scan = new Scanner(System.in);
        ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

        int op = 0;


        do{


            System.out.println("##ESCOLHA UMA OPÇÃO##\n");
            System.out.println("1 - Cadastrar Aluno");


            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Sair \n");
            System.out.println("Digite uma opção: ");
            op = scan.nextInt();

            switch(op){


                case 1:
                    System.out.println("Bem vindo ao sistema de cadastro de Alunos\n");

                    System.out.println("Nome: ");
                    aluno.setNome(scan.nextLine()); //Ocorre erro

                    System.out.println("Idade: ");
                    aluno.setIdade(scan.nextInt()); //Ocorre erro

                    System.out.println("Gênero ('F' para Feminino e 'M' para Masculino): ");
                    aluno.setGenero(scan.next().charAt(0)); //Ocorre erro
                    scan.nextLine();

                    System.out.println("RA: ");
                    aluno.setRa(scan.nextLine()); //Ocorre erro

                case 2:
                    System.out.println("Bem vindao ao sistema de cadastro de Professores");

                case 3:
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }while(op != 3);
    }
}