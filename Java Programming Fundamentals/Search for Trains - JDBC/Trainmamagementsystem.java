import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class TrainManagementSystem {
    	public ArrayList <Train> viewTrain (String coachType, String source, String destination){
    		
    		// Fill your code here	
    		ArrayList<Train> trainList = new ArrayList<Train>();
    		try {
    		    Connection con = DB.getConnection();
    		    Statement statement = con.createStatement();
    		    String query = "SELECT * FROM train WHERE source = '" + source + "' AND destination = '" + destination+ "' AND " + coachType + " != 0 ORDER BY train_number";
    		    ResultSet result = statement.executeQuery(query);
    		    while(result.next()){
    		        int train_number = result.getInt(1);
    		        String train_name = result.getString(2);
    		        String sc = result.getString(3);
   		            String ds = result.getString(4);
   		            int ac1 = result.getInt(5);
   		            int ac2 = result.getInt(6);
                    int ac3 = result.getInt(7);
    		        int sleeper = result.getInt(8);
    		        int seater = result.getInt(9);
    		        trainList.add(new Train(train_number,train_name,sc,ds,ac1,ac2,ac3,sleeper,seater));
    		    }
    		    statement.close();
    		    con.close();
    		    return trainList;
    		} 
    		catch(SQLException e) {
    		    e.printStackTrace();
    		}
    		catch(ClassNotFoundException e){
            e.printStackTrace();
            }
   	return null;
 	}
}
