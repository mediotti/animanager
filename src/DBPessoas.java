import java.util.ArrayList;

public class DBPessoas {
    ArrayList<FichaCadastralFuncionario> funcionariosDB;
    ArrayList<FichaCadastralTutor> tutoresDB;

    public ArrayList<FichaCadastralFuncionario> getFuncionariosDB() {
        return funcionariosDB;
    }

    public void setFuncionariosDB(ArrayList<FichaCadastralFuncionario> funcionariosDB) {
        this.funcionariosDB = funcionariosDB;
    }

    public ArrayList<FichaCadastralTutor> getTutoresDB() {
        return tutoresDB;
    }

    public void setTutoresDB(ArrayList<FichaCadastralTutor> tutoresDB) {
        this.tutoresDB = tutoresDB;
    }
}
