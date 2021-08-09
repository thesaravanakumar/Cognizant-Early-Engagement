import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoanManagementSystem {
    public int viewLoanCountBasedOnType(String loanType) {
        int count = 0;

        try {
            Connection connection = DB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select count(loanId)\n" +
                            "from loan\n" +
                            "where loanType = ?;"
            );
            preparedStatement.setString(1, loanType);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                count = resultSet.getInt(1);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return count;
    }
}
