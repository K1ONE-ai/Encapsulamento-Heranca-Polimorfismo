package SistemaFuncionario;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(
                ";jhion",
                "32643843433-44",
                20000.00,
                1);
        Gerente gerente = new Gerente(
                "Vyton",
                "23223242-38",
                50000.00,
                2);


        System.out.println(gerente.bonificacao(gerente.salario));
        System.out.println(funcionario.bonificacao(funcionario.salario));


        gerente.test();
        gerente.test("Jhion");
        gerente.test("vyton", "Caik" );

    }
}
