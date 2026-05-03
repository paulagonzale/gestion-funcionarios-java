import java.sql.*;
import java.util.*;

public class FuncionarioDAOImpl implements FuncionarioDAO {

    public void insertar(Funcionario f) throws Exception {
        try (Connection con = Conexion.getConexion()) {
            String sql = "INSERT INTO funcionarios(nombre, apellido, documento, id_departamento, id_cargo) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, f.getNombre());
            ps.setString(2, f.getApellido());
            ps.setString(3, f.getDocumento());
            ps.setInt(4, f.getIdDepartamento());
            ps.setInt(5, f.getIdCargo());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new Exception("Error al insertar", e);
        }
    }

    public List<Funcionario> listar() throws Exception {
        List<Funcionario> lista = new ArrayList<>();
        try (Connection con = Conexion.getConexion()) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM funcionarios");
            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setId(rs.getInt("id_funcionario"));
                f.setNombre(rs.getString("nombre"));
                f.setApellido(rs.getString("apellido"));
                f.setDocumento(rs.getString("documento"));
                lista.add(f);
            }
        }
        return lista;
    }

    public void actualizar(Funcionario f) throws Exception {}
    public void eliminar(int id) throws Exception {}
}