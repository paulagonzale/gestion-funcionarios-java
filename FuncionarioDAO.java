import java.util.List;

public interface FuncionarioDAO {
    void insertar(Funcionario f) throws Exception;
    void actualizar(Funcionario f) throws Exception;
    void eliminar(int id) throws Exception;
    List<Funcionario> listar() throws Exception;
}