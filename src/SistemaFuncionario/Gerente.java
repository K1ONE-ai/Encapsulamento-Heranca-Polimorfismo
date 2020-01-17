package SistemaFuncionario;

public class Gerente extends Funcionario {
    int numeroFuncionariosGerenciados;


    public Gerente(String nome, String cpf, double salario, int cargo) {
        super(nome, cpf, salario, cargo);
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    @Override
    public double bonificacao(double salario) {
        salario = salario * 0.5;
        return salario;
    }
    // polimorfismo
    public void test(){
        System.out.println("Ola aluninhods!!!");
    }
    public void test(String nome){
        System.out.println("Ola aluno: " + nome);
    }
    public void test(String nome, String sobrenome){
        System.out.println("iai: " + nome + sobrenome);
    }
}
