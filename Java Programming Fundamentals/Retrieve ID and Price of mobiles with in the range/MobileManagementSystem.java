import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

public class MobileManagementSystem {
    public Map<Integer, Integer> viewMobileWithInTheRange(int minRange, int maxRange) {
        Map<Integer, Integer> mobiles = new LinkedHashMap<>();

        try {
            Connection connection = DB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select productId, price\n" +
                            "from mobile\n" +
                            "where price between ? and ?\n" +
                            "order by productId;"
            );
            preparedStatement.setInt(1, minRange);
            preparedStatement.setInt(2, maxRange);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int productId = resultSet.getInt(1);
                int price = resultSet.getInt(2);
                mobiles.put(productId, price);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return mobiles;
    }
}
