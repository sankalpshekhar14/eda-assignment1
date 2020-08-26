import java.util.HashMap;
import java.util.Map;

/**
  DataStore class that provides access to user data.
  This class accesses a database.
 */
public class DataStore {

	//Hash Map
	private Map<String, Cosine> TrigoMap = new HashMap<>();
	
	private static DataStore instance = new DataStore();
	public static DataStore getInstance(){
		return instance;
	}

	public Cosine getValue(float radian) {
		return TrigoMap.get(radian);
	}

	public void putValue(Cosine a) {
		TrigoMap.put(a.value(1.0), a);
	}
}