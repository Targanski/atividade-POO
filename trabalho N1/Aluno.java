

public class Aluno {
    public static void main(String[] args) {
        System.out.println("ola");

        Dados aluno = new Dados();

        aluno.Dados.nome = "Luan Targanski";
        aluno.Dados.corpele = "cor da sua pele pardo";
        aluno.Dados.idade = 21;

        aluno.cpf = "seu CPF é 06013508127";
        aluno.cidade = "mora em Sinop";
        aluno.estado = "Mato Grosso";
        aluno.AnoNascimento = 2001;

        System.out.println(aluno.Dados.nome);
        System.out.println(aluno.Dados.corpele);
        System.out.println(aluno.Dados.idade);

        System.out.println(aluno.AnoNascimento);
        System.out.println(aluno.cpf);
        System.out.println(aluno.cidade);
        System.out.println(aluno.estado);
        
    }

}
