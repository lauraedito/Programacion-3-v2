package BellaI;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class Models {
	private Connection connection;

    String url = "jdbc:mysql://sql.freedb.tech:3306/freedb_Bella Italia";
    String usuario = "freedb_Edith";
    String contraseña = "rs@ZRHWKFX@!PV4";

    public Models(String url, String usuario, String contraseña) throws SQLException {
        connection = DriverManager.getConnection(url, usuario, contraseña);
    }




	public boolean autenticarUsuario(String correo, String contraseña) {
		String consulta = "SELECT * FROM tablaUsuarios WHERE correo = ? AND contraseña = ?";
		try (PreparedStatement statement = connection.prepareStatement(consulta)) {
			statement.setString(1, correo);
			statement.setString(2, contraseña);
			try (ResultSet resultSet = statement.executeQuery()) {
				return resultSet.next(); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	

	public void cerrarConexion() {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
