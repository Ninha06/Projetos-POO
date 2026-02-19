import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //não é necessário colocar main em todas as classes, apenas em uma
        //variavel local nunca sera um atributo, pois somente pertence ao metódo
        // n tem static em atributos (caracteristicas), quando é um objeto
        // toda classe é um novo tipo de dado
        //endereço do objeto (quando imprime a variável)
        //toda vez que o tipo for uma classe a variavel se torna objeto, se cria classes para objetos
        Aluno a = new Aluno();
        //instancia da classe
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        a.nome=entrada.next();

        System.out.println("Digite o curso do aluno:");
        a.curso=entrada.next();

        System.out.println("Digite o rm do aluno:");
        a.rm= entrada.nextInt();

        System.out.println("Digite a nota 1 do estudante:");
        a.nota1=entrada.nextInt();

        System.out.println("Digite a nota 2 do estudante:");
        a.nota2=entrada.nextInt();


        System.out.print(a.nome);
        System.out.print(a.curso);
        System.out.print(a.rm);


    }



}
