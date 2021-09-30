public class Secretario extends Funcionario {

    private String tipo_de_sec;

    public Secretario(String nome, int telefone, String morada, String CC, 
    boolean vacinado, int numeroFuncionario, int salario, boolean ativo, String tipoSec) {

        super(nome, telefone, morada, CC, ativo, numeroFuncionario, salario, ativo);

        this.setTipoSec(tipoSec);
    }

    public void setTipoSec(String Tipo){
        this.tipo_de_sec = Tipo;
    }

    public String getTipoSec(){
        return this.tipo_de_sec;
    }


    public Turma criarTurma(int numeroTurma, String curso, int ano){
        Turma novaTurma = new Turma(numeroTurma, curso, ano);
        return novaTurma;
    }

    public void adicionarAluno(Turma turmaObj, String nome, int telefone, String morada, String CC, boolean vacinado, 
    int numeroAluno, int turma, int ano, String Curso){
        Aluno novoAluno = new Aluno(nome, telefone, morada, CC, vacinado, numeroAluno, turma, ano, Curso);
        turmaObj.addAluno(novoAluno);
    }


}